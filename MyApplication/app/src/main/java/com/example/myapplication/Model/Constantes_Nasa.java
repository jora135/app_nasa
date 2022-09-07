package com.example.myapplication.Model;

public final class Constantes_Nasa {

    public static final String Version1 = "/";
    public static final String Root_URL = "https://api.nasa.gov"+Version1;
    public static final String Information_User = "planetary/apod";
    public static final String Key_Access = "?api_key=";
    public static final String Access_Token = "fFqAQ6TttvmE8bJPH1Np1lNSlQcB3AjacayyckcR";
    public static final String URL_GET_User = Information_User+Key_Access+Access_Token;

    public static final String base_url = "https://api.nasa.gov/";
    public static final String Information_User_Earth = "planetary/earth/assets";
    public static final String Access_Token_Earth = "fFqAQ6TttvmE8bJPH1Np1lNSlQcB3AjacayyckcR";

    public static final String URL_GET_User_Earth1 = Information_User_Earth+"?lon=";
    public static final String URL_GET_User_Earth2 = "&lat=";
    public static final String URL_GET_User_Earth3 = "&date=";
    public static final String URL_GET_User_Earth4 = "&&dim=0.10&api_key="+Access_Token_Earth;


}
//https:api.nasa.gov/planetary/apod?api_key=fFqAQ6TttvmE8bJPH1Np1lNSlQcB3AjacayyckcR

//https://api.nasa.gov/planetary/earth/assets?lon=-95.33&lat=29.88&date=2018-01-01&&dim=0.10&api_key=fFqAQ6TttvmE8bJPH1Np1lNSlQcB3AjacayyckcR