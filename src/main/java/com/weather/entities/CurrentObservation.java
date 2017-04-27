package com.weather.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Author: a.medinsky
 * Created by: ModelGenerator on 4/27/2017
 */
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class CurrentObservation {

    private int dewpointF;
    private int dewpointC;
    private int windDegrees;
    private double tempF;
    private double tempC;
    private double windMph;
    private double windKph;
    private String stationId;
    private String observationTime;
    private String observationTimeRfc;
    private String observationEpoch;
    private String localTimeRfc;
    private String localEpoch;
    private String localTzShort;
    private String localTzLong;
    private String localTzOffset;
    private String weather;
    private String temperatureString;
    private String relativeHumidity;
    private String windString;
    private String windDir;
    private String windGustMph;
    private String windGustKph;
    private String pressureMb;
    private String pressureIn;
    private String pressureTrend;
    private String dewpointString;
    private String heatIndexString;
    private String heatIndexF;
    private String heatIndexC;
    private String windchillString;
    private String windchillF;
    private String windchillC;
    private String feelslikeString;
    private String feelslikeF;
    private String feelslikeC;
    private String visibilityMi;
    private String visibilityKm;
    private String solarradiation;
    private String UV;
    private String precipHrString;
    private String precipHrIn;
    private String precipHrMetric;
    private String precipTodayString;
    private String precipTodayIn;
    private String precipTodayMetric;
    private String icon;
    private String iconUrl;
    private String forecastUrl;
    private String historyUrl;
    private String obUrl;
    private String nowcast;
    private Image image;
    private DisplayLocation displayLocation;
    private ObservationLocation observationLocation;
    private Estimated estimated;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
    }

    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    @JsonIgnore
    public Estimated getEstimated() {
        return estimated;
    }

    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    @JsonProperty("observation_time_rfc822")
    public String getObservationTimeRfc() {
        return observationTimeRfc;
    }

    public void setObservationTimeRfc(String observationTimeRfc) {
        this.observationTimeRfc = observationTimeRfc;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    @JsonProperty("local_time_rfc822")
    public String getLocalTimeRfc() {
        return localTimeRfc;
    }

    public void setLocalTimeRfc(String localTimeRfc) {
        this.localTimeRfc = localTimeRfc;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public int getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(int windDegrees) {
        this.windDegrees = windDegrees;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public String getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(String windGustMph) {
        this.windGustMph = windGustMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public String getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(String windGustKph) {
        this.windGustKph = windGustKph;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    public int getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(int dewpointF) {
        this.dewpointF = dewpointF;
    }

    public int getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(int dewpointC) {
        this.dewpointC = dewpointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    public String getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public String getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public String getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public String getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    @JsonProperty("UV")
    public String getUV() {
        return UV;
    }

    public void setUV(String UV) {
        this.UV = UV;
    }

    @JsonProperty("precip_1hr_string")
    public String getPrecipHrString() {
        return precipHrString;
    }

    public void setPrecipHrString(String precipHrString) {
        this.precipHrString = precipHrString;
    }

    @JsonProperty("precip_1hr_in")
    public String getPrecipHrIn() {
        return precipHrIn;
    }

    public void setPrecipHrIn(String precipHrIn) {
        this.precipHrIn = precipHrIn;
    }

    @JsonProperty("precip_1hr_metric")
    public String getPrecipHrMetric() {
        return precipHrMetric;
    }

    public void setPrecipHrMetric(String precipHrMetric) {
        this.precipHrMetric = precipHrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }

    public String getNowcast() {
        return nowcast;
    }

    public void setNowcast(String nowcast) {
        this.nowcast = nowcast;
    }
}