package com.etf.guardian.openapi.services;

import com.etf.guardian.openapi.services.ema.EmaStockData;
import com.etf.guardian.openapi.services.sma.SmaStockData;
import com.etf.guardian.openapi.services.stoch.StochStockData;
import com.etf.guardian.openapi.services.timeSeries.TSStockData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class AlphaVantageClient {
    private static final Logger log = LoggerFactory.getLogger(AlphaVantageClient.class);
    private String endpointUrl = "https://www.alphavantage.co/query?";

    private RestTemplate restTemplate;
    @Value("${api.key}")
    private String apiKey;

    public AlphaVantageClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public TSStockData getTSStockData(String symbol){
        TSStockData data = restTemplate.getForObject(
                endpointUrl+"key=function=TIME_SERIES_WEEKLY&symbol="+symbol.trim()+ "&apikey="
                        + apiKey, TSStockData.class);

        log.info("Data received TS"+ data.getMetaData().getInformation());
//        log.info("TimeSeries received"+ data.getTimeSeries().get("2024-03-22 19:55:00").getClose());
//
        return data;
    }

    public EmaStockData getEmaStockData10(String symbol){
        EmaStockData data = restTemplate.getForObject( endpointUrl+ "function=EMA&symbol=" + symbol.trim()+
                        "&interval=weekly&time_period=10&series_type=open&apikey=" + apiKey,EmaStockData.class);
        log.info("Data received 10" + data.getMetaData().getSymbol());
        return data;
    }

    public EmaStockData getEmaStockData20(String symbol){
        EmaStockData data = restTemplate.getForObject( endpointUrl+ "function=EMA&symbol=" + symbol.trim()+
                "&interval=weekly&time_period=20&series_type=open&apikey=" + apiKey,EmaStockData.class);
        log.info("Data received 20" + data.getMetaData().getSymbol());
        return data;
    }

    public EmaStockData getEmaStockData50(String symbol){
        EmaStockData data = restTemplate.getForObject( endpointUrl+ "function=EMA&symbol=" + symbol.trim()+
                "&interval=weekly&time_period=50&series_type=open&apikey=" + apiKey,EmaStockData.class);
        log.info("Data received 50" + data.getMetaData().getSymbol());
        return data;
    }

//    public SmaStockData getSmaStockData(String symbol){
//        SmaStockData data = restTemplate.getForObject(endpointUrl+ "function=SMA&symbol=" + symbol.trim() +
//                "&interval=weekly&apikey=" + apiKey, SmaStockData.class);
//
//        return data;
//
//    }

    public StochStockData getStochStockData(String symbol){
        StochStockData data = restTemplate.getForObject(endpointUrl+
                "function=STOCH&symbol="+symbol.trim()+"&interval=weekly&apikey="+ apiKey, StochStockData.class);

        return data;

    }





}
