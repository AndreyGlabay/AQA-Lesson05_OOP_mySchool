package com.example.school.tests.api; // (step 1.a) Create new package "api"

import com.example.school.tests.api.dto.Authors;
import com.example.school.tests.api.dto.AuthorsPost;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import okhttp3.OkHttpClient; // (1.g) Implement OkHTTP3 library;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import java.io.IOException;
import java.util.Arrays;

public class FakeRestApiTests { // (1.b) Create new test class "FakeRESTApi" -> (7) Rename it to "FakeRestApiTests";
    final String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1"; // (1.c) Create var = Copy URL from the resource;
    OkHttpClient client = new OkHttpClient.Builder().build(); // (1.h) Implement new object - instance of OkHTTPClient;

    // (step 2) Implement 1st test -  be realised with Jackson - done in step 1;
    // (step 6.a) On the annotation level assign test to the group "group_Api_1" for realise test run order in testng.xml;
    @Test (testName = "TestCase1_Jackson", priority = 1, groups = {"group_Api_1"})
    public void authors() { // (1.d) Create test method "authors()" for method GET;
        final String endpointName = "/Authors"; // (1.e) Initiate var "endpointName" = endpoint acc. to the task;
        String url = apiUrl + endpointName; // (1.f) Initiate var "url", which consist of api and endpoint;

        Request request = new Request.Builder() // (1.i) Create new object for make request using builder;
                .url(url)
                .header("accept", "text/plain; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) { // (1.j) Make possibility for request execution;
            int code = response.code(); // (1.k) Initiate var and create assertion for check response code;

            // (3.1.a) Check that response code is 200;
            Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);
            assert response.body() != null; //(1.k.1) IDEA suggestion;
            System.out.println("GET: TestCase1_Jackson: Check that response code is 200");

            // (!) (step 1.t) Hide next 2 lines (step 1.k) to comments due to conflict: read the response body twice -
            //                - is impossible: after first time - stream will be closed;
            // var responseBody = response.body().string(); // (1.k) Initiate var and create assertion for check response body;
            // Assert.assertTrue(responseBody.contains("Last Name 72"), "Value \"Last Name 72\" is not found");

            // (3.1.b) To avoid attempt double-read the stream - lets put response.body() to the var "responseBody"
            String responseBody = response.body().string();

            var mapper = new ObjectMapper(); // (1.r) Add new var, put to it ObjectMapper() for response array parsing;
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            var authors = mapper.readValue(responseBody, Authors[].class); // (1.s) Parse DTO "Authors";
            System.out.println("Response Body: " + Arrays.toString(authors)); // (step 10) Change "(... + authors);" ->
            // -> to the "(... + Arrays.toString(authors));" for get actual values, but not only the link to the Array.

            // (3.1.b) Check that response body contain value "42"
            Assert.assertTrue(responseBody.contains("42"), "Response body doesn't have value 42");
            System.out.println("GET: TestCase1_Jackson: Check that response body contain value \"42\"");

            // (3.1.c) Check that response body contain value "Last Name 276"
            Assert.assertTrue(responseBody.contains("Last Name 276"), "Response body value \"Last Name 276\" missing");
            System.out.println("GET: TestCase1_Jackson: Check that response body contain value \"Last Name 276\"");
            System.out.println();

        } catch (IOException e) {
            Assert.fail(e.toString()); // (step 8) Change "throw new IOException(e)" on "Assert.fail(e.toString())"
        }
    }

    // (step 2) Implement 2nd test -  be realised with Jackson;
    // (step 6.a) On the annotation level assign test to the group "group_Api_2" for realise test run order in testng.xml;
    @Test (testName = "TestCase2_Jackson", priority = 2, groups = {"group_Api_2"})
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

                // (3.2.a) Check that response code is 200 (according to Swagger);
                Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);
                assert response.body() != null;
                String responseBody = response.body().string();
                System.out.println("Response Body: " + responseBody);
                System.out.println("POST: TestCase2_Jackson: Check that response code is 200");

                // (3.2.b) Check that response header "content-type" is present
                Headers headers = response.headers();
                boolean acceptHeaderPresent = headers.names().contains("content-type");
                Assert.assertTrue(acceptHeaderPresent, "Header \"content-type\" is missing!");
                System.out.println("POST: TestCase2_Jackson: Check that response header \"content-type\" is present");

                // (3.2.с) Check that response header "server" has value "Kestrel"
                boolean acceptHeaderValue = headers.values("server").contains("Kestrel");
                Assert.assertTrue(acceptHeaderValue, "In the header \"server\" value is wrong or missing!");
                System.out.println("POST: TestCase2_Jackson: Check that response header \"server\" has value \"Kestrel\"");
                System.out.println();
            }

        } catch (IOException e) {
            Assert.fail(e.toString()); // (step 8) Change "throw new IOException(e)" on "Assert.fail(e.toString())"
        }
    }

    // (step 2) Implement 3rd test -  be realised with JsonObject;
    // (step 6.a) On the annotation level assign test to the group "group_Api_3" for realise test run order in testng.xml;
    @Test (testName = "TestCase3_JsonObject", priority = 1, groups = {"group_Api_3"})
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

            // (3.3.a) Check that response code is 200 (according to Swagger);
            int code = response.code();
            Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);
            System.out.println("DELETE: TestCase3_JsonObject: Check that response code is 200");

            // (3.3.b) Check that response message is "OK" (according to Swagger);
            String responseMessage = response.message();
            Assert.assertTrue(responseMessage.contains("OK"), "Response message doesn't contain \"OK\"");
            System.out.println("DELETE: TestCase3_JsonObject: Check that response message is \"OK\" (according to Swagger);");

            // (3.3.с) Check that response header "content-length" has value "0"
            Headers headers = response.headers();
            boolean acceptHeaderValue = headers.values("content-length").contains("0");
            Assert.assertTrue(acceptHeaderValue, "In the header \"content-length\" value is wrong or missing!");
            System.out.println("DELETE: TestCase3_JsonObject: Check that response header \"content-length\" = \"0\"");
            System.out.println();

        } catch (IOException e) {
            Assert.fail(e.toString()); // (step 8) Change "throw new IOException(e)" on "Assert.fail(e.toString())"
        }
    }
}