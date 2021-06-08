package com.moveo.aem.training.core.models;

import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.services.beans.DailyForecastBean;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Model(adaptables = Resource.class)
public class WeatherModel {

    @Inject
    private String latitude;

    @Inject
    private String longitude;

    @OSGiService
    private WeatherService weatherService;

    private static final Logger LOG = LoggerFactory.getLogger(WeatherModel.class);
    private List<DailyForecastBean> weatherList;

    @PostConstruct
    protected void init() {

        LOG.debug("WeatherModel instanciated lat {} lon {}" , latitude, longitude);
       try {
           weatherList = weatherService.getDailyForecast(latitude, longitude);
       }
       catch(IOException exception){
           LOG.error("WeatherModel latitude/longitude non inseriti");
           weatherList = new ArrayList<>();
       }
    }

    public List<DailyForecastBean> getWeatherList() {
        return weatherList;
    }
}
