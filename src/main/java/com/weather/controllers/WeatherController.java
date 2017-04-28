package com.weather.controllers;

import com.weather.entities.WeatherResponse;
import com.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/{cityName}")
    public WeatherResponse find(@PathVariable("cityName") String cityName) {
        return weatherService.find(cityName);
    }

    @RequestMapping("/{countryName}/{cityName}")
    public WeatherResponse find(@PathVariable("countryName") String countryName, @PathVariable("cityName") String cityName) {
        return weatherService.find(countryName, cityName);
    }

}
