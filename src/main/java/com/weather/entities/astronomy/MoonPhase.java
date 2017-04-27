package com.weather.entities.astronomy;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author: a.medinsky
 * Created by: ModelGenerator on 4/27/2017
 */
public class MoonPhase {
    private String percentIlluminated;
    private String ageOfMoon;
    private String phaseofMoon;
    private String hemisphere;
    private CurrentTime currentTime;
    private Sunrise sunrise;
    private Sunset sunset;
    private Moonrise moonrise;
    private Moonset moonset;

    public String getPercentIlluminated() {
        return percentIlluminated;
    }

    public void setPercentIlluminated(String percentIlluminated) {
        this.percentIlluminated = percentIlluminated;
    }

    public String getAgeOfMoon() {
        return ageOfMoon;
    }

    public void setAgeOfMoon(String ageOfMoon) {
        this.ageOfMoon = ageOfMoon;
    }

    public String getPhaseofMoon() {
        return phaseofMoon;
    }

    public void setPhaseofMoon(String phaseofMoon) {
        this.phaseofMoon = phaseofMoon;
    }

    public String getHemisphere() {
        return hemisphere;
    }

    public void setHemisphere(String hemisphere) {
        this.hemisphere = hemisphere;
    }

    @JsonProperty("current_time")
    public CurrentTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(CurrentTime currentTime) {
        this.currentTime = currentTime;
    }

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

    public Moonrise getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(Moonrise moonrise) {
        this.moonrise = moonrise;
    }

    public Moonset getMoonset() {
        return moonset;
    }

    public void setMoonset(Moonset moonset) {
        this.moonset = moonset;
    }
}