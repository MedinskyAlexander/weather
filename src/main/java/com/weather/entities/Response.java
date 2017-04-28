package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Author: a.medinsky
 * Created by: ModelGenerator on 4/27/2017
 */
public class Response {
    private String version;
    private String termsofService;
    private Features features;
    private List<ResultsItem> results;
    private com.weather.entities.Error error;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ResultsItem> getResults() {
        return results;
    }

    public void setResults(List<ResultsItem> results) {
        this.results = results;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Response{" +
                "version='" + version + '\'' +
                ", termsofService='" + termsofService + '\'' +
                ", features=" + features +
                ", results=" + results +
                ", error=" + error +
                '}';
    }
}