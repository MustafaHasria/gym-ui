package com.mustafahasria.gymui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfileRecyclerAdapter extends RecyclerView.Adapter<ProfileRecyclerAdapter.ProfileViewHolder> {

    private List<ProfileModel> profileModelList;

    public ProfileRecyclerAdapter(List<ProfileModel> profileModelList, photo photo) {
        this.profileModelList = profileModelList;
    }
    @NonNull
    @Override
    public ProfileRecyclerAdapter.ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_list_item, parent, false);
        return new ProfileViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(@NonNull ProfileRecyclerAdapter.ProfileViewHolder holder, int position) {
        holder.image.setImageResource(profileModelList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return profileModelList.size();    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);

        }
    }
}
