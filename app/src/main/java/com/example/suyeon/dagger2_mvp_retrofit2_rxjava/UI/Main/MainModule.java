package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Main;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Dagger2.ActivityScoped;

//의존성주입객체의 구조를 만든다.
@Module
public abstract class MainModule {

    //의존성주입객체 MainPresenter
    @ActivityScoped //액티비티 Lifecycle
    @Binds          //@Provides에서 parameter를 그대로 return하는 과정을 줄여준다.
    abstract MainInterface.Presenter mainPresenter(MainPresenter mainPresenter);
}
