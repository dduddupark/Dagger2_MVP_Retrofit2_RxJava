package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.NetWork;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import timber.log.Timber;

public class HeaderInterceptor implements Interceptor{      //Header 내용

    public HeaderInterceptor() { }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request preRequest = chain.request();

        Request proRequest = preRequest.newBuilder()
                            .header("Accept", "application/vnd.github.v3.full+json")
                            .header("Users-Agent", "Retrofit-Sample-App")
                            .build();

        Timber.d(proRequest.headers().toString());
        Timber.d(proRequest.url().toString());

        Response response = chain.proceed(proRequest);

        return response;
    }

}
