package com.etf.guardian.openapi.api;

import com.etf.guardian.openapi.models.*;
import com.etf.guardian.openapi.services.AlphaVantageClient;
import com.etf.guardian.openapi.services.timeSeries.TSStockData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("${openapi.eTFGuardian30.base-path:}")
public class EtfApiController {
    private static final Logger log = LoggerFactory.getLogger(EtfApiController.class);
    private AlphaVantageClient alphaVantageClient;
    public EtfApiController(AlphaVantageClient alphaVantageClient){
        this.alphaVantageClient=alphaVantageClient;
    }

    @RequestMapping(value = "/watchlist/{id}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<WatchlistRequest> addETFToWatchlist(@PathVariable("id") String id,
                                                       String symbol, @RequestBody WatchlistRequest watchlistRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }



    @RequestMapping(value = "/watchlist/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteETF(@PathVariable("id") String id, String symbol) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }



    @RequestMapping(value = "/etfs/popular",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<PopularResponse> getPopularETF() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }



    @RequestMapping(value = "/etfs",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<SummaryResponse> getSpecificETF(@RequestParam(value = "symbol", required = true) String symbol) {
        log.info("Symbol Received:"+symbol);
        TSStockData tsStockData = alphaVantageClient.getTSStockData(symbol);

        List<Indicator> indicators = new ArrayList<>();
        String firstKey = tsStockData.getTimeSeries().keySet().iterator().next();
        Indicator price = new Indicator("price",tsStockData.getTimeSeries().get(firstKey).getClose(),
                "buy");
        Indicator ema = new Indicator("EMA", "1", "buy");
        indicators.add(price);
        indicators.add(ema);
        SummaryResponse response = new SummaryResponse();
        response.setIndicators(indicators);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }



    @RequestMapping(value = "/watchlist/{id}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<WatchListResponse> getWatchlistById(@PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
