package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Main;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.R;

public class MainActivity extends DaggerAppCompatActivity implements MainInterface.View{ //DaggerAppCompatActivity 상속

    //Presenter를 주입해준다.
    @Inject
    MainPresenter mainPresenter;

    //ButterKnife
    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mainPresenter.takeView(this);

        loadData();
    }

    private void loadData()
    {
        mainPresenter.loadText();
    }

    @Override
    public void setText(String str) {
        tv.setText(str);
    }
}
