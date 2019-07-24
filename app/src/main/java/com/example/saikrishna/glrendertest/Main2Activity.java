package com.example.saikrishna.glrendertest;

import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.saikrishna.glrendertest.exoplayer.ReactExoplayerView;

public class Main2Activity extends AppCompatActivity {
    ReactExoplayerView reactExoplayerView;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        linearLayout = findViewById(R.id.ll);
        reactExoplayerView = new ReactExoplayerView(this);
        Uri srcUri = Uri.parse("https://player.uacdn.net/lesson-raw/YEU14M8NPF0CYEZC2TVG/output.mp4");
        if (srcUri != null) {
            reactExoplayerView.setProgressUpdateInterval(50);
            reactExoplayerView.setUseGreenScreen(true);
            reactExoplayerView.setRateModifier(1);
            reactExoplayerView.setMaxBitRateModifier(0);
            reactExoplayerView.setSrc(srcUri, "", null);
            reactExoplayerView.setPausedModifier(false);
            reactExoplayerView.setPlayWhenReady(true);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reactExoplayerView.seekTo(600000);
                }
            }, 3000);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(400, 250);
        linearLayout.addView(reactExoplayerView, layoutParams);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (reactExoplayerView != null) {
            reactExoplayerView.onResume();
        }
    }
}
