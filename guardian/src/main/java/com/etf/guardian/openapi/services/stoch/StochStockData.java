package com.etf.guardian.openapi.services.stoch;

import com.etf.guardian.openapi.services.ema.MetaDataEMA;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class StochStockData {
    @JsonProperty("Meta Data")
    private MetaDataEMA metaData;
    @JsonProperty("Technical Analysis: STOCH")
    private Map<String, StochData> stochData;

    public MetaDataEMA getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataEMA metaData) {
        this.metaData = metaData;
    }

    public Map<String, StochData> getStochData() {
        return stochData;
    }

    public void setStochData(Map<String, StochData> stochData) {
        this.stochData = stochData;
    }


}
