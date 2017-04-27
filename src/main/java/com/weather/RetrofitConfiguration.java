package com.weather;

import com.weather.http.WeatherClientAPI;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;


@Configuration
@PropertySource("classpath:weather.properties")
public class RetrofitConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder()
                .build();
    }

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(environment.getProperty(Constants.WEATHER_API_BASE_URL))
                .client(okHttpClient())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    @Bean
    public WeatherClientAPI weatherAPI() {
        return retrofit().create(WeatherClientAPI.class);
    }

}
