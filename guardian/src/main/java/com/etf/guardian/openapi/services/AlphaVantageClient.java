package com.etf.guardian.openapi.services;

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
                endpointUrl+"function=TIME_SERIES_INTRADAY&symbol="+symbol+ "&interval=5min&outputsize=full&apikey=" +
                        apiKey, TSStockData.class);

        log.info("Data received"+ data.getMetaData().getInformation());
        log.info("TimeSeries received"+ data.getTimeSeries().get("2024-03-22 19:55:00").getClose());
//
        return data;
    }


}
