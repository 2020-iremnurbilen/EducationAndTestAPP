package com.irem.FinalProject.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.irem.FinalProject.R;
import com.irem.FinalProject.utils.SlideAdapter;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerInitListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView dataList;
    List<String> titles;
    SlideAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        YouTubePlayerView youtubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youtubePlayerView);

        youtubePlayerView.initialize(new YouTubePlayerInitListener() {
            @Override
            public void onInitSuccess(@NonNull final YouTubePlayer initializedYouTubePlayer) {
                initializedYouTubePlayer.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady() {
                        String videoId = "-wGQGEOTf4E";
                        initializedYouTubePlayer.loadVideo(videoId, 0);
                    }
                });
            }
        }, true);

        Context context = getApplicationContext();
        dataList = findViewById(R.id.recyclerSlider);
        titles = new ArrayList<>();

        titles.add(getString(R.string.worldwar1_1));
        titles.add(getString(R.string.worldwar1_2));
        titles.add(getString(R.string.worldwar1_3));
        titles.add(getString(R.string.worldwar1_4));
        titles.add(getString(R.string.worldwar1_5));

        adapter = new SlideAdapter(MainActivity.this,titles);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        dataList.setLayoutManager(layoutManager); // set LayoutManager to RecyclerView
        SnapHelper snapHelper = new PagerSnapHelper();
        dataList.setLayoutManager(layoutManager);
        snapHelper.attachToRecyclerView(dataList);
        dataList.setAdapter(adapter);
    }


    public void startquiz(View view) {
        Intent cnn = new Intent( MainActivity.this, TestActivity.class );
        startActivity( cnn );
        finish();
    }

    @Override
    public void onBackPressed() {
    }
}