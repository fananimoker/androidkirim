package com.fanani.erif.brol.form;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fanani.erif.brol.R;
import com.fanani.erif.brol.utama.Home;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void daftar(View view){
        startActivity(new Intent(Login.this, Register.class));
    }
    public void login(View view){
        startActivity(new Intent(Login.this, Home.class));
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void onBackPressed(){
        finishAffinity();
    }
}
