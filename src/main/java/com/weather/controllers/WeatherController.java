package com.weather.controllers;

import com.weather.entities.WeatherResponse;
import com.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value = "/{cityName}", method = RequestMethod.GET)
    public WeatherResponse find(@PathVariable("cityName") String cityName) {
        return weatherService.find(cityName);
    }

    @RequestMapping(value = "/{countryName}/{cityName}", method = RequestMethod.GET)
    public WeatherResponse find(@PathVariable("countryName") String countryName,
                                @PathVariable("cityName") String cityName) {
        return weatherService.find(countryName, cityName);
    }

    @RequestMapping(value = "/{countryName}/{stateName}/{cityName}", method = RequestMethod.GET)
    public WeatherResponse find(@PathVariable("countryName") String countryName,
                                @PathVariable("stateName") String stateName,
                                @PathVariable("cityName") String cityName) {
        return weatherService.find(countryName, stateName, cityName);
    }

}
