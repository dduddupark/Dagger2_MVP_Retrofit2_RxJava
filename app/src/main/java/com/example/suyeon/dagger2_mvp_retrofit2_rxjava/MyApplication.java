package com.example.suyeon.dagger2_mvp_retrofit2_rxjava;

import android.content.Context;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Dagger2.DaggerAppComponent;
import timber.log.Timber;

public class MyApplication extends DaggerApplication { //DaggerApplication을 상속 받아야한다.

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}
