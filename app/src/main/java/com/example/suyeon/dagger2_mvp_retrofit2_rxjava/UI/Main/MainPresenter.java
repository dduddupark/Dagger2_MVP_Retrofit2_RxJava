package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.UI.Main;

import androidx.annotation.Nullable;

import java.util.List;

import javax.inject.Inject;

import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data.DataManager;
import com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data.Users;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class MainPresenter implements MainInterface.Presenter {

    DataManager dataManager;

    //여기서 @Inject를 해주면 MainModule에서 @Provide를 안해도 생성자때 알아서 공급된다.
    @Inject
    MainPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Nullable
    MainInterface.View view;

    @Override
    public void takeView(MainInterface.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }

    @Override
    public void loadText() {

        dataManager.getUserData()
                .enqueue(new Callback<List<Users>>() {
                    @Override
                    public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                        Timber.d("onResponse");
                        Timber.d("response = " + response.body());
                        view.setText("onResponse = " + response.body());
                    }

                    @Override
                    public void onFailure(Call<List<Users>> call, Throwable t) {
                        Timber.d("onFailure");
                        Timber.d("Throwable = " + t.getMessage());
                        view.setText("onFailure");
                    }
                });

    }
}
