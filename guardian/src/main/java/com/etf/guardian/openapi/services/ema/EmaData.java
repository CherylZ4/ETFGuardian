package com.etf.guardian.openapi.services.ema;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmaData {
    @JsonProperty("EMA")
    private String ema;

    // Getters and Setters
    public String getEma() {
        return ema;
    }

    public void setEma(String ema) {
        this.ema = ema;
    }
}
