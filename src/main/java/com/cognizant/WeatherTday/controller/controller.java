package com.cognizant.WeatherTday.controller;

import com.cognizant.WeatherTday.models.Root;
import com.cognizant.WeatherTday.models.Weather;
import com.cognizant.WeatherTday.service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping(value="/weather")
public class controller {

    @Autowired
    private weatherService weatherservice;

    @GetMapping(value = "/forecast/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getWeatherinfo(@PathVariable(value="city") String city) throws IOException {
        Root newRoot = weatherservice.getWeather(city);
        System.out.println(newRoot.getName()+"\n"+newRoot.getCod()+"\n"+newRoot.getId());
        List<Weather> newWeather = newRoot.getWeather();
        for(Weather i: newWeather)
        {
            System.out.println(i.getDescription());
        }
        System.out.println(newRoot.main.getFeels_like());
    }
}
