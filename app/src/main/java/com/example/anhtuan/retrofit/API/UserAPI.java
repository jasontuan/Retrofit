package com.example.anhtuan.retrofit.API;

import com.example.anhtuan.retrofit.model.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ANH TUAN on 1/30/2018.
 */

public interface UserAPI {

    String BASE_URL = "https://lit-basin-20477.herokuapp.com/";

    @GET("users")
    Call<UserResponse> getUsers(@Query("page") int page, @Query("limit") int limit);
}
