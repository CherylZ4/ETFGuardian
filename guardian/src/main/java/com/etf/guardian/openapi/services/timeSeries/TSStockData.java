package com.etf.guardian.openapi.services.timeSeries;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TSStockData {
    @JsonProperty("Meta Data")
    private MetaDataTS metaDataTS;

    @JsonProperty("Weekly Time Series")
    private Map<String, TimeSeriesData> timeSeries;

    public MetaDataTS getMetaData() {
        return metaDataTS;
    }

    public void setMetaData(MetaDataTS metaDataTS) {
        this.metaDataTS = metaDataTS;
    }

    public Map<String, TimeSeriesData> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(Map<String, TimeSeriesData> timeSeries) {
        this.timeSeries = timeSeries;
    }

}
