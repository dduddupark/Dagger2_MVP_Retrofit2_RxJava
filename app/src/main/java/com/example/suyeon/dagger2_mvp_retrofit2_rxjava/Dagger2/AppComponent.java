package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Dagger2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data.DataManager;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data.ServerModule;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.MyApplication;

@Singleton
@Component(modules = { AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServerModule.class })
public interface AppComponent extends AndroidInjector<MyApplication> {

    DataManager getDataManager();

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
