package com.example.suyeon.dagger2_mvp_retrofit2_rxjava.Data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Users {    //데이터 클래스

    public ArrayList<User> Users = new ArrayList<>();

    public class User
    {
        @SerializedName("login") String login;
        @SerializedName("id") String id;
        @SerializedName("node_id") String node_id;
    }
}
