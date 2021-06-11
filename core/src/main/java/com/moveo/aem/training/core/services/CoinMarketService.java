package com.moveo.aem.training.core.services;

import com.moveo.aem.training.core.services.beans.CoinMarketBean;
import java.io.IOException;
import java.net.URISyntaxException;

public interface CoinMarketService {

     public CoinMarketBean getCryptocurrencyPrices() throws IOException, URISyntaxException;

}
