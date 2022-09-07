package com.example.myapplication.Interface;

import com.example.myapplication.Model.Constantes_Nasa;
import com.example.myapplication.Model.NASA_Obt;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NASAApi {
    @GET(Constantes_Nasa.URL_GET_User)
    Call<NASA_Obt> getDataNasa();
}
