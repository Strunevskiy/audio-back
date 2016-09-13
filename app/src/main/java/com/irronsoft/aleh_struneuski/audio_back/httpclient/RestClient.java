package com.irronsoft.aleh_struneuski.audio_back.httpclient;

import com.google.gson.Gson;
import com.irronsoft.aleh_struneuski.audio_back.constants.ProjectConstants;
import com.irronsoft.aleh_struneuski.audio_back.httpclient.services.SoundCloundService;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alehstruneuski on 6/13/16.
 */
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

    public Retrofit getRetrofitClient(){
        return retrofit;
    }
}
