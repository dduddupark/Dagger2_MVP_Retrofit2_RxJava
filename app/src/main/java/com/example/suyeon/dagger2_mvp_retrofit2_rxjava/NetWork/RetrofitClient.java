package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.NetWork;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
public class RetrofitClient {   //Singleton

    @Inject
    RetrofitClient() { }

    private static Retrofit retrofit = null;

    public static Retrofit getClient()
    {
        if (retrofit == null)
        {
            //서버 로그 찍어주는것
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new HeaderInterceptor())    //헤더 추가
                    .addInterceptor(interceptor)                //서버 로그 추가
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")         //Default URL
                    .addConverterFactory(GsonConverterFactory.create())     //JSON Parser
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())      //RXAndroid 사용
                    .client(client)
                    .build();
        }

        return retrofit;
    }
}
