package com.etf.guardian.openapi.services.stoch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StochData {
    @JsonProperty("SlowK")
    private String slowK;

    @JsonProperty("SlowD")
    private String slowD;


    public String getSlowK() {
        return slowK;
    }

    public void setSlowK(String slowK) {
        this.slowK = slowK;
    }

    public String getSlowD() {
        return slowD;
    }

    public void setSlowD(String slowD) {
        this.slowD = slowD;
    }






}
