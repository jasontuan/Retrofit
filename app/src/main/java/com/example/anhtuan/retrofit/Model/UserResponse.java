package com.example.anhtuan.retrofit.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ANH TUAN on 1/31/2018.
 */

public class UserResponse {

    @SerializedName("users")
    public List<Users> list;

    public List<Users> getList() {
        return list;
    }

    public void setList(List<Users> list) {
        this.list = list;
    }
}
