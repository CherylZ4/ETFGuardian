package com.etf.guardian.openapi.services.ema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class EmaStockData {
    @JsonProperty("Meta Data")
    private MetaDataEMA metaData;
    @JsonProperty("Technical Analysis: EMA")
    private Map<String, EmaData> emaData;

    // Getters and Setters
    public MetaDataEMA getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataEMA metaData) {
        this.metaData = metaData;
    }

    public Map<String, EmaData> getEmaData() {
        return emaData;
    }

    public void setEmaData(Map<String, EmaData> emaData) {
        this.emaData = emaData;
    }
}
