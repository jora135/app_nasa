package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class list_info extends AppCompatActivity {


    ImageButton icon_nasa;
    ImageButton icon_home;
    ImageButton icon_gps;
    ImageButton icon_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_info);

        //========================ir a imagen y mensaje
        icon_nasa=(ImageButton)findViewById(R.id.icon_nasa);

        icon_nasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(list_info.this, MainActivity.class);
                startActivity(i);
            }
        });
        //========================ir a home=========================================
        icon_home=(ImageButton)findViewById(R.id.icon_home);

        icon_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(list_info.this, tierra_info.class);
                startActivity(i);
            }
        });
        //========================ir a satelite=========================================
        icon_gps=(ImageButton)findViewById(R.id.icon_gps);

        icon_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(list_info.this, satelite_info.class);
                startActivity(i);
            }
        });
        //========================ir a list=========================================
        icon_list=(ImageButton)findViewById(R.id.icon_list);

        icon_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(list_info.this, list_info.class);
                startActivity(i);
            }
        });
    }
}