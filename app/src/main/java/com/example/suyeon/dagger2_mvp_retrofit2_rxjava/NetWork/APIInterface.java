package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.NetWork;


import java.util.List;

import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data.Users;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface APIInterface {     //Retrofit 형식

    @GET("users")
    Call<List<Users>> getUser();
}
