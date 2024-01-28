package com.example.school.tests.api; // (step 1.a) Create new package "api"

import org.testng.annotations.Test;

public class FakeRESTApi { // (step 1.b) Create new test class "FakeRESTApi"
    final String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1"; // (1.c) Create var = Copy URL from the resource;
    @Test
    public void authors() {
        final String endpointName = "/Authors"; // (1.d) Initiate var "endpointName" = endpoint acc. to the task;
        String url = apiUrl + endpointName; // (1.e) Initiate var "url", which consist of api and endpoint;
    }
}
