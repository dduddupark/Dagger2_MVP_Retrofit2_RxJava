package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.NetWork.APIInterface;
import retrofit2.Call;

@Singleton
public class DataManager {  //전체적인 데이터 관리

    private final APIInterface apiInterface;

    @Inject
    DataManager(APIInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    public Call<List<Users>> getUserData()
    {
        return apiInterface.getUser();
    }

}
