package com.example.school.tests; // (2.1.a) In the dir src/test/java create new package "com.example.school.tests";

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import okhttp3.OkHttpClient;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AnalyticsTest { // (2.1.b) In the package "com.example.school.tests" create new test class "AnalyticsTest";
    OkHttpClient client = new OkHttpClient.Builder().build(); // (2.1.c) Implements new OkHttpClient;
    WireMockServer wireMockServer
            = new WireMockServer(new WireMockConfiguration().port(9098));//(2.1.d)Implements new WireMockServer;


    @BeforeClass // (2.1.e) Implements @BeforeClass annotation
    public void beforeClass(){
        wireMockServer.start(); // (2.1.f) Implements start of wireMockServer;
        WireMock.configureFor(9098); // (2.1.g) Implements configuration creating using port num;

    }
    @AfterClass // (2.1.e) Implements @AfterClass annotation
    public void afterClass(){

    }
}
