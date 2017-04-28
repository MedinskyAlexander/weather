package com.weather.services;

import com.weather.entities.WeatherResponse;
import com.weather.http.WeatherClientAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;


@Service
public class WeatherService {

    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);

    @Autowired
    private WeatherClientAPI weatherClientAPI;

    public WeatherResponse find(String cityName) {
        WeatherResponse result = null;
        Call<WeatherResponse> call = weatherClientAPI.getCityWeather(cityName);
        try {
            Response<WeatherResponse> response = call.execute();
            result = response.body();
        } catch (IOException e) {
            log.error("Could not obtain weather info for city '{}'", cityName, e);
        }
        return result;
    }

    public WeatherResponse find(String countryName, String stateName, String cityName) {
        WeatherResponse result = null;
        Call<WeatherResponse> call = weatherClientAPI.getCityWeather(countryName, stateName, cityName);
        try {
            Response<WeatherResponse> response = call.execute();
            result = response.body();
        } catch (IOException e) {
            log.error("Could not obtain weather info for city '{}' / '{}'", cityName, countryName, e);
        }
        return result;
    }

}
