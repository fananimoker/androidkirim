package com.fanani.erif.brol.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fanani.erif.brol.R;

public class Register extends AppCompatActivity {

    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnSimpan=(Button)findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Login.class));
                System.exit(0);
            }
        });
    }
    public void onBackPressed(){
        startActivity(new Intent(getBaseContext(), Login.class));
        System.exit(0);
    }
}
