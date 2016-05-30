package com.vienan.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.vienan.animpopup.AnimPopup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void startAnim(View v){
        Log.i("v","v:"+v.getX()+" "+v.getY());
        AnimPopup.getInstance(MainActivity.this)
                .setMsg(" + 1 ")
                .setTextColor(Color.RED)
                .showOnTop(v)
                .show();
    }
}