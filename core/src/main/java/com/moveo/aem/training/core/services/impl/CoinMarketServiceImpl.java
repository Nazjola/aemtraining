package com.moveo.aem.training.core.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.beans.CoinMarketResult;
import com.moveo.aem.training.core.services.CoinMarketService;
import com.moveo.aem.training.core.services.CoinMarketServiceDesignate;
import com.moveo.aem.training.core.services.beans.CoinMarketBean;
import com.moveo.aem.training.core.utils.HttpClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Designate(ocd= CoinMarketServiceDesignate.class)
@Component(service= CoinMarketService.class)
public class CoinMarketServiceImpl implements CoinMarketService {
    private boolean enable;
    private String apiKey;


@Override
public List<CoinMarketBean> getCryptocurrencyPrices() throws URISyntaxException,IOException {


       String uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
       String result =  HttpClient.executeUri(uri,apiKey);

       ObjectMapper objectMapper = new ObjectMapper();
       CoinMarketResult coinResult = objectMapper.readValue(result, CoinMarketResult.class);

       //todo control if result bean has values,works correctly
       List<CoinMarketResult> coinMarketResultList = new ArrayList<>();
       coinMarketResultList.add(coinResult);
       List<CoinMarketBean> coinMarketBeanList = new ArrayList<>();

        for (CoinMarketResult resultBean : coinMarketResultList) {
               CoinMarketBean coinMarketBean = new CoinMarketBean();
               coinMarketBean.setNameEth(resultBean.getData().getEth().getSymbol());
               coinMarketBean.setNameBtc(resultBean.getData().getBtc().getSymbol());
               coinMarketBean.setPriceEth(resultBean.getData().getEth().getQuote().getUsd().getPrice().toString());
               coinMarketBean.setPriceBtc(resultBean.getData().getBtc().getQuote().getUsd().getPrice().toString());
               coinMarketBean.setDailystatusEth(resultBean.getData().getEth().getQuote().getUsd().getPercentChange24h().toString());
               coinMarketBean.setDailystatusBtc(resultBean.getData().getBtc().getQuote().getUsd().getPercentChange24h().toString());
               coinMarketBean.setWeeklystatusEth(resultBean.getData().getEth().getQuote().getUsd().getPercentChange7d().toString());
               coinMarketBean.setWeeklystatusBtc(resultBean.getData().getBtc().getQuote().getUsd().getPercentChange7d().toString());
               coinMarketBeanList.add(coinMarketBean);
           }

        return coinMarketBeanList;
}

    @Activate
    protected void activate(final CoinMarketServiceDesignate config) {
        enable = config.enable();
        apiKey = config.apiKey();
    }

}
