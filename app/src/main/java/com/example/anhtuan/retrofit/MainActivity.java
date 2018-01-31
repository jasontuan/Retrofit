package com.example.anhtuan.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anhtuan.retrofit.API.UserAPICallback;
import com.example.anhtuan.retrofit.Presenter.MainPresenter;
import com.example.anhtuan.retrofit.adapter.RecyclerViewAdapter;
import com.example.anhtuan.retrofit.Model.Users;

import java.util.List;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private List<Users> usersList;
    private RecyclerViewAdapter recyclerViewAdapter;
    private UserAPICallback userAPICallback;
    private MainPresenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new MainPresenter(this, usersList, recyclerViewAdapter, userAPICallback);
        mainPresenter.MainPresenter();
    }
}
