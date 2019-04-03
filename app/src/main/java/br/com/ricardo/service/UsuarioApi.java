package br.com.ricardo.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsuarioApi {

    private static Retrofit retrofit = null;

    private static final String URL = "http://jsonplaceholder.typicode.com/";

    public static Retrofit getUsuario() {

//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                //.client(client)
                .build();

        return retrofit;
    }
}