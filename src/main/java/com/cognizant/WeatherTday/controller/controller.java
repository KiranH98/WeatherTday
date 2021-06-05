package com.cognizant.WeatherTday.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/weather")
public class controller {
    @Value("$(api.key)")
    private String apiKey;


    @RequestMapping("/{city_name}")
    public void getWeatherinfo(@PathVariable("city_name") String city_name)
    {

    }
}
