package com.example.anhtuan.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ANH TUAN on 1/30/2018.
 */

public class Geo {

    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;

    public Geo() {
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
