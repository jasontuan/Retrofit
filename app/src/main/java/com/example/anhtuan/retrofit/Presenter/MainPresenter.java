package com.example.anhtuan.retrofit.Presenter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anhtuan.retrofit.API.UserAPI;
import com.example.anhtuan.retrofit.API.UserAPICallback;
import com.example.anhtuan.retrofit.MainActivity;
import com.example.anhtuan.retrofit.Model.Users;
import com.example.anhtuan.retrofit.R;
import com.example.anhtuan.retrofit.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by ANH TUAN on 1/31/2018.
 */

public class MainPresenter {

    private Context context;
    private List<Users> usersList;
    @BindView(R.id.rcv_View)
    RecyclerView rcvView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private UserAPICallback userAPICallback;
    UserAPI userAPI;

    public MainPresenter(Context context, List<Users> usersList, RecyclerViewAdapter recyclerViewAdapter, UserAPICallback userAPICallback) {
        this.context = context;
        this.usersList = usersList;
        this.recyclerViewAdapter = recyclerViewAdapter;
        this.userAPICallback = userAPICallback;
    }

    public void MainPresenter() {
        usersList = new ArrayList<>();
        recyclerViewAdapter = new RecyclerViewAdapter(usersList, context);
        rcvView.setLayoutManager(new LinearLayoutManager(context));
        rcvView.setAdapter(recyclerViewAdapter);
        userAPICallback = new UserAPICallback(context, usersList, recyclerViewAdapter, userAPI);
        userAPICallback.getUsers();
    }
}
