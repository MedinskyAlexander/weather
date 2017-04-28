package com.weather.services;

import com.weather.entities.WeatherResponse;
import com.weather.http.WeatherClientAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;


@Service
public class WeatherService {

    @Autowired
    private WeatherClientAPI weatherClientAPI;

    public WeatherResponse find(String cityName) {
        WeatherResponse result = null;
        Call<WeatherResponse> call = weatherClientAPI.getCityWeather(cityName);
        try {
            Response<WeatherResponse> response = call.execute();
            result = response.body();
        } catch (IOException e) {
            //todo: add logging
        }
        return result;
    }

    public WeatherResponse find(String countryName, String cityName) {
        WeatherResponse result = null;
        Call<WeatherResponse> call = weatherClientAPI.getCityWeather(countryName, cityName);
        try {
            Response<WeatherResponse> response = call.execute();
            result = response.body();
        } catch (IOException e) {
            //todo: add logging
        }
        return result;
    }

}
