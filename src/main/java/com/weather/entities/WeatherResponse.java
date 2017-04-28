package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.weather.entities.astronomy.MoonPhase;
import com.weather.entities.astronomy.SunPhase;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Author: a.medinsky
 * Created by: ModelGenerator on 4/27/2017
 */
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class WeatherResponse {

    private Response response;
    private CurrentObservation currentObservation;
    private MoonPhase moonPhase;
    private SunPhase sunPhase;

    @JsonInclude(Include.NON_NULL)
    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @JsonInclude(Include.NON_NULL)
    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    @JsonInclude(Include.NON_NULL)
    public MoonPhase getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(MoonPhase moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonInclude(Include.NON_NULL)
    public SunPhase getSunPhase() {
        return sunPhase;
    }

    public void setSunPhase(SunPhase sunPhase) {
        this.sunPhase = sunPhase;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "response=" + response +
                ", currentObservation=" + currentObservation +
                ", moonPhase=" + moonPhase +
                ", sunPhase=" + sunPhase +
                '}';
    }
}