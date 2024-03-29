package com.stonecolders.checkmate;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;

    static Retrofit getClient() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://tosdr.org/api/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
