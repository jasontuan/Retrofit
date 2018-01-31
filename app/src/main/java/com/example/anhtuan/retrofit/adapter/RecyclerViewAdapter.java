package com.example.anhtuan.retrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anhtuan.retrofit.R;
import com.example.anhtuan.retrofit.Model.Users;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ANH TUAN on 1/30/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.DataViewHolder> {

    private List<Users> usersList;
    private Context context;

    public RecyclerViewAdapter(List<Users> usersList, Context context) {
        this.usersList = usersList;
        this.context = context;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        Users person = usersList.get(position);
        holder.tvName.setText(person.getName());
        holder.tvUsername.setText(person.getUsername());
        holder.tvEmail.setText(person.getEmail());
        holder.tvPhone.setText(person.getPhone());
        holder.tvWebsite.setText(person.getWebsite());
        Glide.with(context).load(person.getAvatar()).into(holder.imgAvatar);
    }

    @Override
    public int getItemCount() {
        return usersList != null ? usersList.size() : 0;
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_avatar)
        ImageView imgAvatar;
        @BindView(R.id.tv_name)
         TextView tvName;
        @BindView(R.id.tv_username)
       TextView tvUsername;
        @BindView(R.id.tv_email)
         TextView tvEmail;
        @BindView(R.id.tv_phone)
         TextView tvPhone;
        @BindView(R.id.tv_website)
         TextView tvWebsite;

        public DataViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
