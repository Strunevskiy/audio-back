package com.aleh.struneuski.background.network.httpclient;

import com.aleh.struneuski.background.constants.ProjectConstants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static RestClient restClient = null;
    private Retrofit retrofit = null;

    private RestClient() {
        if (null == retrofit) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ProjectConstants.API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public static RestClient getInstance() {
        if (null == restClient) {
            restClient = new RestClient();
        }
        return restClient;
    }

    public Retrofit getRetrofitClient() {
        return retrofit;
    }
}
