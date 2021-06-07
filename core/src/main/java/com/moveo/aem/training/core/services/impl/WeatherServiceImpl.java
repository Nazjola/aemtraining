package com.moveo.aem.training.core.services.impl;

import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.services.beans.DailyForecastBean;
import org.osgi.service.component.annotations.Component;

import java.util.List;

@Component(service= WeatherService.class)
public class WeatherServiceImpl implements WeatherService {


    @Override
    public List<DailyForecastBean> getDailyForecast(String latitude, String longitude) {
        return null;



    }
}
