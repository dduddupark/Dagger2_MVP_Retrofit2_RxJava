package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Main;

import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Base.BasePresenter;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Base.BaseView;

public interface MainInterface {

    interface View extends BaseView<Presenter> {
        void setText(String str);
    }

    interface Presenter extends BasePresenter<View> {
        void loadText();
    }

}
