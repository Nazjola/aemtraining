package com.moveo.aem.training.core.models;

import com.moveo.aem.training.core.services.CoinMarketService;
import com.moveo.aem.training.core.services.beans.CoinMarketBean;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class)
public class CoinMarketModel {

    @OSGiService
    private CoinMarketService coinMarketService;

    private static final Logger LOG = LoggerFactory.getLogger(CoinMarketModel.class);
    private List<CoinMarketBean> coinMarketList;

    @PostConstruct
    protected void init() {
        LOG.debug("Coin Market Model");

        try {
            coinMarketList = coinMarketService.getCryptocurrencyPrices();
        }
        catch(IOException | URISyntaxException exception){
            LOG.error("WeatherModel latitude/longitude non inseriti");
            coinMarketList = new ArrayList<>();
        }
    }

    public List<CoinMarketBean> getCoinMarketList() {
        return
                coinMarketList;
    }
}
