package com.etf.guardian.openapi.services.sma;

import com.etf.guardian.openapi.services.ema.EmaData;
import com.etf.guardian.openapi.services.ema.MetaDataEMA;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class SmaStockData {
    @JsonProperty("Meta Data")
    private MetaDataSMA metaData;
    @JsonProperty("Technical Analysis: SMA")
    private Map<String, SmaData> smaData;

    // Getters and Setters
    public MetaDataSMA getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataSMA metaData) {
        this.metaData = metaData;
    }

    public Map<String, SmaData> getSmaData() {
        return smaData;
    }

    public void setSmaData(Map<String, SmaData> smaData) {
        this.smaData = smaData;
    }
}
