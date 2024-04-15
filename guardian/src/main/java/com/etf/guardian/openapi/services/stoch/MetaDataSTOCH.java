package com.etf.guardian.openapi.services.stoch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaDataSTOCH {
    @JsonProperty("1: Symbol")
    private String symbol;

    @JsonProperty("2: Indicator")
    private String indicator;

    @JsonProperty("3: Last Refreshed")
    private String lastRefreshed;

    @JsonProperty("4: Interval")
    private String interval;

    @JsonProperty("5.1: FastK Period")
    private String fastKPeriod;

    @JsonProperty("5.2: SlowK Period")
    private String slowKPeriod;

    @JsonProperty("5.3: SlowK MA Type")
    private String slowKMA;

    @JsonProperty("5.4: SlowD Period")
    private String slowDPeriod;

    @JsonProperty("5.5: SlowD MA Type")
    private String slowDMA;

    @JsonProperty("6: Time Zone")
    private String timeZone;

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

    public String getFastKPeriod() {
        return fastKPeriod;
    }

    public void setFastKPeriod(String fastKPeriod) {
        this.fastKPeriod = fastKPeriod;
    }

    public String getSlowKPeriod() {
        return slowKPeriod;
    }

    public void setSlowKPeriod(String slowKPeriod) {
        this.slowKPeriod = slowKPeriod;
    }

    public String getSlowKMA() {
        return slowKMA;
    }

    public void setSlowKMA(String slowKMA) {
        this.slowKMA = slowKMA;
    }

    public String getSlowDPeriod() {
        return slowDPeriod;
    }

    public void setSlowDPeriod(String slowDPeriod) {
        this.slowDPeriod = slowDPeriod;
    }

    public String getSlowDMA() {
        return slowDMA;
    }

    public void setSlowDMA(String slowDMA) {
        this.slowDMA = slowDMA;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
