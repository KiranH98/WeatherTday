package com.cognizant.WeatherTday.service;

import com.cognizant.WeatherTday.models.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Service;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.io.IOException;


@Service
public class weatherService {

    private OkHttpClient client;
    private Root root;
    private String city;
    private String unit;
    private ResponseBody response;
    private  String API_ID = "005d618c85965267990c93f60fb12a83";

/*
method to get data from API and store in POJO can bbe done using RestTemplate
*/
    public Root getWeather(String city){
        client = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();
        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&appid=" + API_ID)
                .build();
        /*Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/weather?q=Chennai&units=metric&appid=" + API_ID)
                .build();*/
        try {
            response = client.newCall(request).execute().body();
            root = objectMapper.readValue(response.string(), Root.class);
            /*System.out.println(root.getName()+"\n"+root.getCod()+"\n"+root.getId());*/
            return root;
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }
    }
