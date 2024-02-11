package com.example.school.tests; // (2.1.a) In the dir src/test/java create new package "com.example.school.tests";

import okhttp3.OkHttpClient;

public class AnalyticsTest { // (2.1.b) In the package "com.example.school.tests" create new test class "AnalyticsTest";
    OkHttpClient client = new OkHttpClient.Builder().build(); // (2.1.c) Implements new OkHttpClient;
}
