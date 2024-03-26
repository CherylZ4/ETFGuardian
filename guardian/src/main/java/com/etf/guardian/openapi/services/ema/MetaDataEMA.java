package com.etf.guardian.openapi.services.ema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaDataEMA {
    @JsonProperty("1: Symbol")
    private String symbol;

    @JsonProperty("2: Indicator")
    private String indicator;

    @JsonProperty("3: Last Refreshed")
    private String lastRefreshed;

    @JsonProperty("4: Interval")
    private String interval;

    @JsonProperty("5: Time Period")
    private int timePeriod;

    @JsonProperty("6: Series Type")
    private String seriesType;

    @JsonProperty("7: Time Zone")
    private String timeZone;

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(String seriesType) {
        this.seriesType = seriesType;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
