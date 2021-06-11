package com.moveo.aem.training.core.services;

import com.moveo.aem.training.core.services.beans.CoinMarketBean;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface CoinMarketService {

     public List<CoinMarketBean> getCryptocurrencyPrices() throws IOException, URISyntaxException;

}
