package com.weather.entities.astronomy;

/**
 * Author: a.medinsky
 * Created by: ModelGenerator on 4/27/2017
 */
public class SunPhase {
    private Sunrise sunrise;
    private Sunset sunset;

    public Sunrise getSunrise() {
        return sunrise;
    }

    public void setSunrise(Sunrise sunrise) {
        this.sunrise = sunrise;
    }

    public Sunset getSunset() {
        return sunset;
    }

    public void setSunset(Sunset sunset) {
        this.sunset = sunset;
    }
}