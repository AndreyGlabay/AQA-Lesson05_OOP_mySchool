package com.example.school.tests; // (2.1.a) In the dir src/test/java create new package "com.example.school.tests";

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import okhttp3.OkHttpClient;

public class AnalyticsTest { // (2.1.b) In the package "com.example.school.tests" create new test class "AnalyticsTest";
    OkHttpClient client = new OkHttpClient.Builder().build(); // (2.1.c) Implements new OkHttpClient;
    WireMockServer wireMockServer
            = new WireMockServer(new WireMockConfiguration().port(9098));//(2.1.d)Implements new WireMockServer;
}
