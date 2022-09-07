
package com.example.myapplication.Interface;
import com.example.myapplication.satelite_info;
import com.example.myapplication.Model.Earth_Obt;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EarthApi {
    @GET()
    Call<Earth_Obt> getDataEarth();
}
