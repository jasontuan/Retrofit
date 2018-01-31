package com.example.anhtuan.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.anhtuan.retrofit.API.UserAPI;
import com.example.anhtuan.retrofit.adapter.RecyclerViewAdapter;
import com.example.anhtuan.retrofit.model.UserResponse;
import com.example.anhtuan.retrofit.model.Users;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private List<Users> list_user;
    @BindView(R.id.rcv_View)
    RecyclerView rcvView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(UserAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        list_user = new ArrayList<>();
        recyclerViewAdapter = new RecyclerViewAdapter(list_user, MainActivity.this);
        rcvView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rcvView.setAdapter(recyclerViewAdapter);

        UserAPI userAPI = retrofit.create(UserAPI.class);
        Call<UserResponse> call = userAPI.getUsers(0, 10);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                list_user.addAll(response.body().list);
                recyclerViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
