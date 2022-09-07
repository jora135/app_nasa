package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.Model.Constantes_Nasa;
//import com.example.myapplication.Model.url_completa;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public final class satelite_info extends AppCompatActivity {

    ImageButton icon_nasa;
    ImageButton icon_home;
    ImageButton icon_gps;
    ImageButton icon_list;

    EditText txtLatitud;
    EditText txtLongitud;
    EditText txtFecha;
    Button buttonLandsat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satelite_info);

        //==================================================================
        txtLatitud=(EditText)findViewById(R.id.txtLatitud);
        txtLongitud=(EditText)findViewById(R.id.txtLongitud);
        txtFecha=(EditText)findViewById(R.id.txtFecha);
        buttonLandsat=(Button)findViewById(R.id.buttonLandsat);

        buttonLandsat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lat = txtLatitud+"";
                String lon = txtLongitud+"";
                String fech = txtFecha+"";
                String url_Get = Constantes_Nasa.URL_GET_User_Earth1+lon+Constantes_Nasa.URL_GET_User_Earth2+lat+Constantes_Nasa.URL_GET_User_Earth3+fech+Constantes_Nasa.URL_GET_User_Earth4;
                Objet_Json(url_Get);
            }
        });

        //========================ir a imagen y mensaje
        icon_nasa=(ImageButton)findViewById(R.id.icon_nasa);

        icon_nasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(satelite_info.this, MainActivity.class);
                startActivity(i);
            }
        });
        //========================ir a home=========================================
        icon_home=(ImageButton)findViewById(R.id.icon_home);

        icon_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(satelite_info.this, tierra_info.class);
                startActivity(i);
            }
        });
        //========================ir a satelite=========================================
        icon_gps=(ImageButton)findViewById(R.id.icon_gps);

        icon_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(satelite_info.this, satelite_info.class);
                startActivity(i);
            }
        });
        //========================ir a list=========================================
        icon_list=(ImageButton)findViewById(R.id.icon_list);

        icon_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(satelite_info.this, list_info.class);
                startActivity(i);
            }
        });

    }

    private void Objet_Json(String url_get){
        try {
            String str = url_get;
            JSONObject jsonObject = new JSONObject(str.substring(1));
            System.out.println("URL : "+jsonObject.toString());
        } catch (JSONException err) {
            System.out.println("Exception : "+err.toString());
        }
    }

}