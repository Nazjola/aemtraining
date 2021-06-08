package com.moveo.aem.training.core.services;

import com.moveo.aem.training.core.services.beans.DailyForecastBean;

import java.io.IOException;
import java.util.List;

public interface WeatherService {

     public List<DailyForecastBean> getDailyForecast(String latitude, String longitude) throws IOException;


}
