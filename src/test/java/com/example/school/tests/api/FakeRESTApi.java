package com.example.school.tests.api; // (step 1.a) Create new package "api"

import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import okhttp3.OkHttpClient; // (1.g) Implement OkHTTP3 library;

import java.io.IOException;

public class FakeRESTApi { // (step 1.b) Create new test class "FakeRESTApi"
    final String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1"; // (1.c) Create var = Copy URL from the resource;
    OkHttpClient client = new OkHttpClient.Builder().build(); // (1.h) Implement new object - instance of OkHTTPClient;

    @Test
    public void authors() { // (1.d) Create test method "authors()";
        final String endpointName = "/Authors"; // (1.e) Initiate var "endpointName" = endpoint acc. to the task;
        String url = apiUrl + endpointName; // (1.f) Initiate var "url", which consist of api and endpoint;

        Request request = new Request.Builder() // (1.i) Create new object for make request using builder;
                .url(url)
                .header("accept", "text/plain; v=1.0")
                .build();
        try (Response response = client.newCall(request).execute()) { // (1.j) Make possibility for request execution;
            int code = response.code(); // (1.k) Initiate var and create assertion for check response code;
            Assert.assertEquals(code, 200, "ER: response code = 200, AR: response code = " + code);
//            assert response.body() != null; //(1.k.1) IDEA suggestion;
            var body = response.body().string(); // (1.k) Initiate var and create assertion for check response body;
            Assert.assertTrue(body.contains("Last Name 72"), "Value \"Last Name 72\" is not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
