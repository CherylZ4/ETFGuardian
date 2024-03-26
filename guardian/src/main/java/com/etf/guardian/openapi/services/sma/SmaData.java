package com.etf.guardian.openapi.services.sma;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmaData {
    @JsonProperty("SMA")
    private String sma;

    // Getters and Setters
    public String getSma() {
        return sma;
    }

    public void setSma(String sma) {
        this.sma = sma;
    }
}
