package com.weather.http;


import com.weather.entities.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherClientAPI {

    @GET("conditions/astronomy/q/{cityName}.json")
    Call<WeatherResponse> getCityWeather(@Path("cityName") String cityName);

}
