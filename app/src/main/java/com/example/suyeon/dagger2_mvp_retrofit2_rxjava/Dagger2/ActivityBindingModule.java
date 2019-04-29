package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Dagger2;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Main.MainActivity;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Main.MainModule;


@Module
public abstract class ActivityBindingModule {   //전체적인 액티비티 관리

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

}
