package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.myapplication.Interface.NASAApi;
import com.example.myapplication.Model.Constantes_Nasa;
import com.example.myapplication.Model.NASA_Obt;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Button saltar;
    TextView textView1;
    ImageView imgnasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //=========================imagen======================================
        imgnasa=(ImageView)findViewById(R.id.imgnasa);
        //========================texto en pantalla=========================================
        //String texto = "Hola como estas";
        //textView1=(TextView)findViewById(R.id.textView1);
        //textView1.setText(texto);
        textView1=(TextView)findViewById(R.id.textView1);

        find();

        //========================home=========================================
        saltar=(Button)findViewById(R.id.saltar);

        saltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, tierra_info.class);
                startActivity(i);
            }
        });



    }


    private void find(){
        //"https://api.nasa.gov/" > Constantes_Nasa.Root_URL

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constantes_Nasa.Root_URL).addConverterFactory(GsonConverterFactory.create()).build();

        NASAApi nasaApi = retrofit.create(NASAApi.class);
        Call<NASA_Obt> call = nasaApi.getDataNasa();
        call.enqueue(new Callback<NASA_Obt>() {
            @Override
            public void onResponse(Call<NASA_Obt> call, Response<NASA_Obt> response) {
                try{
                    if(response.isSuccessful()){
                        NASA_Obt p = response.body();
                        String url_image = p.getUrl();
                        Glide.with(getApplication()).load(url_image).into(imgnasa);
                        textView1.setText(p.getExplanation());
                    }
                }catch(Exception ex){
                    Toast.makeText(MainActivity.this,ex.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<NASA_Obt> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Error de conexión",Toast.LENGTH_SHORT).show();
            }
        });
    }



}