package com.etf.guardian.openapi.services.timeSeries;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TSStockData {
    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonProperty("Time Series (5min)")
    private Map<String, TimeSeriesData> timeSeries;

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Map<String, TimeSeriesData> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(Map<String, TimeSeriesData> timeSeries) {
        this.timeSeries = timeSeries;
    }

}
