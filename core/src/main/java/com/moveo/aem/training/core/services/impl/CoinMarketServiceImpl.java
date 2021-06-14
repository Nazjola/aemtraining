package com.moveo.aem.training.core.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.HttpHeaders;
import com.moveo.aem.training.core.beans.CoinMarketResult;
import com.moveo.aem.training.core.services.CoinMarketService;
import com.moveo.aem.training.core.services.CoinMarketServiceDesignate;
import com.moveo.aem.training.core.services.beans.CoinMarketBean;
import com.moveo.aem.training.core.utils.HttpClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;

@Designate(ocd= CoinMarketServiceDesignate.class)
@Component(service= CoinMarketService.class)
public class CoinMarketServiceImpl implements CoinMarketService {
    private boolean enable;
    private String apiKey;
    private String urlQuotes;

@Override
public CoinMarketBean getCryptocurrencyPrices() throws IOException {

        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("X-CMC_PRO_API_KEY",apiKey);
        hashmap.put(HttpHeaders.ACCEPT, "application/json");
        String result =  HttpClient.executeUri(urlQuotes,hashmap);

       ObjectMapper objectMapper = new ObjectMapper();
       CoinMarketResult coinResult = objectMapper.readValue(result, CoinMarketResult.class);


    DecimalFormat numberFormat = new DecimalFormat("#.00");
    String pricebtc = numberFormat.format(coinResult.getData().getBtc().getQuote().getUsd().getPrice());
    String priceeth = numberFormat.format(coinResult.getData().getEth().getQuote().getUsd().getPrice());
    String btc24 = numberFormat.format(coinResult.getData().getBtc().getQuote().getUsd().getPercentChange24h());
    String eth24 = numberFormat.format(coinResult.getData().getEth().getQuote().getUsd().getPercentChange24h());
    String btc7 = numberFormat.format(coinResult.getData().getBtc().getQuote().getUsd().getPercentChange7d());
    String eth7 = numberFormat.format(coinResult.getData().getEth().getQuote().getUsd().getPercentChange7d());
       //todo control if result bean has values,works correctly
               CoinMarketBean coinMarketBean = new CoinMarketBean();
               coinMarketBean.setNameEth(coinResult.getData().getEth().getSymbol());
               coinMarketBean.setNameBtc(coinResult.getData().getBtc().getSymbol());
               coinMarketBean.setPriceEth(priceeth);
               coinMarketBean.setPriceBtc(pricebtc);
               coinMarketBean.setDailystatusEth(eth24);
               coinMarketBean.setDailystatusBtc(btc24);
               coinMarketBean.setWeeklystatusEth(eth7);
               coinMarketBean.setWeeklystatusBtc(btc7);

        return coinMarketBean;
}

    @Activate
    protected void activate(final CoinMarketServiceDesignate config) {
        enable = config.enable();
        apiKey = config.apiKey();
        urlQuotes = config.urlQuotes();
    }

}
