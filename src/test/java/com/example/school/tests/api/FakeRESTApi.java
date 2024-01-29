package com.example.school.tests.api; // (step 1.a) Create new package "api"

import com.example.school.tests.api.dto.Authors;
import com.example.school.tests.api.dto.AuthorsPost;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import okhttp3.OkHttpClient; // (1.g) Implement OkHTTP3 library;
import okhttp3.RequestBody;
import okhttp3.MediaType;

import java.io.IOException;
import java.util.Arrays;

public class FakeRESTApi { // (step 1.b) Create new test class "FakeRESTApi"
    final String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1"; // (1.c) Create var = Copy URL from the resource;
    OkHttpClient client = new OkHttpClient.Builder().build(); // (1.h) Implement new object - instance of OkHTTPClient;

    @Test (testName = "TestCase1_Jackson") // (step 2) Implement 1st test -  be realised with Jackson - done in step 1;
    public void authors() { // (1.d) Create test method "authors()" for method GET;
        final String endpointName = "/Authors"; // (1.e) Initiate var "endpointName" = endpoint acc. to the task;
        String url = apiUrl + endpointName; // (1.f) Initiate var "url", which consist of api and endpoint;

        Request request = new Request.Builder() // (1.i) Create new object for make request using builder;
                .url(url)
                .header("accept", "text/plain; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) { // (1.j) Make possibility for request execution;
            int code = response.code(); // (1.k) Initiate var and create assertion for check response code;
            Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);
            assert response.body() != null; //(1.k.1) IDEA suggestion;
            // (!) (step 1.t) Hide next 2 lines (step 1.k) to comments due to conflict: read the response body twice -
            //                - is impossible: after first time - stream will be closed;
            // var responseBody = response.body().string(); // (1.k) Initiate var and create assertion for check response body;
            // Assert.assertTrue(responseBody.contains("Last Name 72"), "Value \"Last Name 72\" is not found");
            var mapper = new ObjectMapper(); // (1.r) Add new var, put to it ObjectMapper() for response array parsing;
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            var authors = mapper.readValue(response.body().string(), Authors[].class); // (1.s) Parse DTO "Authors";
            System.out.println(authors);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test (testName = "TestCase2_Jackson")      // (step 2) Implement 2nd test -  be realised with Jackson
    public void authorsPost() {                 // (step 2) Implement test method "authorsPost()" for method POST;
        final String endpointName = "/Authors"; // (2.1.d) Initiate var "endpointName" = endpoint acc. to the task;
        String url = apiUrl + endpointName;     // (2.1.e) Initiate var "url", which consist of api and endpoint;
        ObjectMapper javaToJson = new ObjectMapper(); // (2.1.f) Implement ObjectMapper for convert java to JSON;

        try {
            AuthorsPost newId100500 = new AuthorsPost(); // (2.1.g) Make the new Object = instance of Class AuthorsPost;
            newId100500.setId(100500);
            newId100500.setIdBook(100500);
            newId100500.setFirstName("John");
            newId100500.setLastName("Doe");
            byte[] requestBodyBytes = javaToJson.writeValueAsBytes(newId100500);;// (2.1.h) Convert Object to byte code;
            Request request = new Request.Builder() // (2.1.i) Create new POST request;
                    .url(url)
                    .header("accept", "text/plain; v=1.0")
                    .header("Content-Type", "application/json; v=1.0")
                    .post(RequestBody.create(MediaType.parse("application/json"), requestBodyBytes))
                    .build();

            try (Response response = client.newCall(request).execute()) { // (2.1.j) Execute POST request;
                int code = response.code();
                // (3) Check that response code is 200 (according to Swagger);
                Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);
                assert response.body() != null;
                String responseBody = response.body().string();
                System.out.println("Response Body: " + responseBody);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test (testName = "TestCase3_JsonObject")       // (step 2) Implement 3rd test -  be realised with JsonObject;
    public void authorsDelete() {                   // (step 2) Implement test method "authorsPost()" for method POST;
        final String endpointName = "/Authors/27";  // (2.2.a) Initiate var "endpointName" = endpoint acc. to the task;
        String url = apiUrl + endpointName;         // (2.2.b) Initiate var "url", which consist of api and endpoint;
        String jsonRequestBody = "";                // (2.2.c) Initiate var "jsonRequestBody", which empty content;

        Request request = new Request.Builder()     // (2.2.d) Create new DELETE request;
                .url(url)
                .method("DELETE", RequestBody.create(jsonRequestBody, MediaType.get("application/json")))
                .header("accept", "*/*")
                .build();

        try (Response response = client.newCall(request).execute()) { // (2.1.e) Execute DELETE request;
            int code = response.code();
            // (3) Check that response code is 200 (according to Swagger);
            Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}