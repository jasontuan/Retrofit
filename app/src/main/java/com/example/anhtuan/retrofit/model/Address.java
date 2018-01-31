package com.example.anhtuan.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ANH TUAN on 1/30/2018.
 */

public class Address {

    @SerializedName("streetA")
    private String streetA;
    @SerializedName("streetB")
    private String streetB;
    @SerializedName("streetC")
    private String streetC;
    @SerializedName("streetD")
    private String streetD;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("country")
    private String country;
    @SerializedName("zipcode")
    private String zipcode;
    @SerializedName("geo")
    private Geo Geo;

    public Address() {
    }

    public String getStreetA() {
        return streetA;
    }

    public void setStreetA(String streetA) {
        this.streetA = streetA;
    }

    public String getStreetB() {
        return streetB;
    }

    public void setStreetB(String streetB) {
        this.streetB = streetB;
    }

    public String getStreetC() {
        return streetC;
    }

    public void setStreetC(String streetC) {
        this.streetC = streetC;
    }

    public String getStreetD() {
        return streetD;
    }

    public void setStreetD(String streetD) {
        this.streetD = streetD;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return Geo;
    }

    public void setGeo(Geo Geo) {
        this.Geo = Geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetA='" + streetA + '\'' +
                ", streetB='" + streetB + '\'' +
                ", streetC='" + streetC + '\'' +
                ", streetD='" + streetD + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", Geo=" + Geo +
                '}';
    }
}
