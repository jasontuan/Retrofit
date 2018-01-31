package com.example.anhtuan.retrofit.API;

import android.content.Context;
import android.widget.Toast;

import com.example.anhtuan.retrofit.Model.UserResponse;
import com.example.anhtuan.retrofit.Model.Users;
import com.example.anhtuan.retrofit.adapter.RecyclerViewAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.anhtuan.retrofit.API.UserAPI.retrofit;

/**
 * Created by ANH TUAN on 1/31/2018.
 */

public class UserAPICallback {

    private Context context;
    private List<Users> usersList;
    private RecyclerViewAdapter recyclerViewAdapter;
    UserAPI userAPI;

    public UserAPICallback(Context context, List<Users> usersList, RecyclerViewAdapter recyclerViewAdapter, UserAPI userAPI) {
        this.context = context;
        this.usersList = usersList;
        this.recyclerViewAdapter = recyclerViewAdapter;
        this.userAPI = userAPI;
    }

    public void getUsers() {
        userAPI = retrofit.create(UserAPI.class);
        Call<UserResponse> call = userAPI.getUsers(0, 10);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if (response.body() != null) {
                    usersList.addAll(response.body().list);
                }
                recyclerViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
