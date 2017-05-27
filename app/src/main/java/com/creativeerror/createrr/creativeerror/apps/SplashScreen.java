package com.creativeerror.createrr.creativeerror.apps;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.creativeerror.createrr.creativeerror.R;
import com.creativeerror.createrr.creativeerror.databinding.ActivitySplashScreenBinding;
import com.squareup.picasso.Picasso;

public class SplashScreen extends AppCompatActivity {
    private ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash_screen);
        Picasso.with(getApplication()).load(R.drawable.createrr).fit().into(binding.img);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
