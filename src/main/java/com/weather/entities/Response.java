package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Author: a.medinsky
 * Created by: ModelGenerator on 4/27/2017
 */
public class Response {
    private String version;
    private String termsofService;
    private Features features;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    @JsonIgnore
    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }
}