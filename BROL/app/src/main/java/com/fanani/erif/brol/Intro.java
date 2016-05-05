package com.fanani.erif.brol;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import com.fanani.erif.brol.form.Login;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        intronya();

    }
    public void intronya(){
        new CountDownTimer(4000,1000) {
            public void onTick(long millisUntilFinished) {
            }
            public void onFinish() {
                startActivity(new Intent(getBaseContext(), Login.class));
                System.exit(0);
            }
        }.start();
    }
}
