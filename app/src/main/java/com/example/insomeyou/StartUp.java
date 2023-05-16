package com.example.insomeyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class StartUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);

        Thread thread = new Thread(){
            public void run(){
                try {
                    Thread.sleep(4000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(StartUp.this, Invitation.class);
                    startActivity(intent);
                    finish();
                }
            }

        };
        thread.start();
    }
}