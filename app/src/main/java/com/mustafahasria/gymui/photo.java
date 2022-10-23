package com.mustafahasria.gymui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class photo extends AppCompatActivity {
    RecyclerView recyclerView;
    ProfileRecyclerAdapter profileRecyclerAdapter;
    List<ProfileModel> profileModelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_photo);
        recyclerView = findViewById(R.id.main_recycler_view_profiles);

        profileModelList.add(new ProfileModel(R.drawable.monky));
        profileModelList.add(new ProfileModel(R.drawable.smile));
        profileModelList.add(new ProfileModel(R.drawable.shadow));
        profileModelList.add(new ProfileModel(R.drawable.monky));
        profileModelList.add(new ProfileModel(R.drawable.smile));
        profileModelList.add(new ProfileModel(R.drawable.shadow));

        profileRecyclerAdapter = new ProfileRecyclerAdapter(profileModelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(profileRecyclerAdapter);





    }
}