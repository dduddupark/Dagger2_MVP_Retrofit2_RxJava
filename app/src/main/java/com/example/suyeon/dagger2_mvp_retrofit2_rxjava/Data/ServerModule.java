package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data;

import android.provider.ContactsContract;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Dagger2.Local;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.NetWork.APIInterface;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.NetWork.RetrofitClient;

@Module
abstract public class ServerModule {

    @Singleton
    @Provides
    static APIInterface provideAPIInterface()
    {
        return RetrofitClient.getClient().create(APIInterface.class);
    }
}
