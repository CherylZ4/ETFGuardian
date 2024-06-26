package com.etf.guardian.openapi.api;

import com.etf.guardian.openapi.models.*;
import com.etf.guardian.openapi.services.AlphaVantageClient;
import com.etf.guardian.openapi.services.ema.EmaData;
import com.etf.guardian.openapi.services.ema.EmaStockData;
import com.etf.guardian.openapi.services.sma.SmaStockData;
import com.etf.guardian.openapi.services.stoch.StochStockData;
import com.etf.guardian.openapi.services.timeSeries.TSStockData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
        List<Indicator> indicators = new ArrayList<>();
        TSStockData tsStockData = alphaVantageClient.getTSStockData(symbol);
        EmaStockData ema10 = alphaVantageClient.getEmaStockData10(symbol);
        EmaStockData ema20 = alphaVantageClient.getEmaStockData20(symbol);
        EmaStockData ema50 = alphaVantageClient.getEmaStockData50(symbol);
        StochStockData stochStockData = alphaVantageClient.getStochStockData(symbol);

        String ema50firstKey = ema50.getEmaData().keySet().iterator().next();
        Map<String, EmaData> emaDataMap = ema50.getEmaData();
        List<EmaData> emaValues = new ArrayList<>(emaDataMap.values());
        String seventhEmaValue;

        EmaData seventhEma = emaValues.get(6); // Remember, lists are zero-indexed
        seventhEmaValue = seventhEma.getEma();

        Double slope =
                ((Double.parseDouble(ema50.getEmaData().get(ema50firstKey).getEma()))-Double.parseDouble(seventhEmaValue))/7.0;
        String ans="hold";
        if (slope >= 0.3){
            ans="buy";
        }else if (slope<=-0.3){
            ans="sell";
        }
        Indicator trend = new Indicator("trend", slope.toString(), ans);



        String stochfirstKey = stochStockData.getStochData().keySet().iterator().next();
        String stochSlowD = stochStockData.getStochData().get(stochfirstKey).getSlowD();
        String stochAction;
        if (Double.parseDouble(stochSlowD) > 80){
            stochAction = "buy";
        }else if (Double.parseDouble(stochSlowD) < 20){
            stochAction = "sell";
        }else{
            stochAction = "hold";
        }
        Indicator stoch = new Indicator("stoch", stochStockData.getStochData().get(stochfirstKey).getSlowD(),
                stochAction);

        String tsfirstKey = tsStockData.getTimeSeries().keySet().iterator().next();
        Indicator price = new Indicator("price",tsStockData.getTimeSeries().get(tsfirstKey).getClose(),
                "buy");

        String latestDay = ema10.getEmaData().keySet().iterator().next();
        Iterator<String> iterator1 = ema10.getEmaData().keySet().iterator();
        iterator1.next();
        String secondDay10 = iterator1.next();

        String ema10value = ema10.getEmaData().get(latestDay).getEma();
        String ema20value = ema20.getEmaData().get(latestDay).getEma();

        Iterator<String> iterator2 = ema20.getEmaData().keySet().iterator();
        iterator2.next();
        String secondDay20 = iterator2.next();

        Double diff = 0.0;
        String choice = "Hold";
        if (Double.parseDouble(ema10value) > Double.parseDouble(ema20value)){
            diff = Double.parseDouble(ema10value) - Double.parseDouble(ema20value);

        }else if (Double.parseDouble(ema20value) > Double.parseDouble(ema10value)){
            diff = (Double.parseDouble(ema20value)-Double.parseDouble(ema10value));

        }
        if (diff ==0){
            if (Double.parseDouble(secondDay10) > Double.parseDouble(secondDay20)){
                choice = "sell";
            }else{
                choice= "buy";
            }
        }
        Indicator emaCrossOver = new Indicator("emaCrossOver", diff.toString(), choice);


        indicators.add(price);
        indicators.add(emaCrossOver);
        indicators.add(stoch);
        indicators.add(trend);


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
