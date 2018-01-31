package com.example.anhtuan.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ANH TUAN on 1/30/2018.
 */

public class AccountHistory {

    @SerializedName("amount")
    private String amount;
    @SerializedName("date")
    private String date;
    @SerializedName("business")
    private String business;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("account")
    private int account;

    public AccountHistory() {
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "AccountHistory{" +
                "amount='" + amount + '\'' +
                ", date='" + date + '\'' +
                ", business='" + business + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", account=" + account +
                '}';
    }
}
