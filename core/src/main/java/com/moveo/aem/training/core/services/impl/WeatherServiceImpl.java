package com.moveo.aem.training.core.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.beans.Daily;
import com.moveo.aem.training.core.beans.DailyForecastResultBean;
import com.moveo.aem.training.core.beans.Temp;
import com.moveo.aem.training.core.beans.Weather;
import com.moveo.aem.training.core.schedulers.SimpleScheduledTask;
import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.services.WeatherServiceDesignate;
import com.moveo.aem.training.core.services.beans.DailyForecastBean;
import com.moveo.aem.training.core.utils.HttpClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Designate(ocd= WeatherServiceDesignate.class)
@Component(service= WeatherService.class)
public class WeatherServiceImpl implements WeatherService {
    private boolean enable;
    private String apiKey;


@Override
public List<DailyForecastBean> getDailyForecast(String latitude, String longitude) throws IOException {

        if (latitude == null || longitude== null){
        throw new IOException("Values not found");}

       //todo control of parameters are in correct format
       String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+latitude+"&lon="+longitude+"&appid="+apiKey+"&exclude=current,minutely,hourly&units=metric";
       String result =  HttpClient.execute(url);

       ObjectMapper objectMapper = new ObjectMapper();
       DailyForecastResultBean resultBean = objectMapper.readValue(result, DailyForecastResultBean.class);

       //todo control if result bean has values,works correctly
       List<DailyForecastBean> dailyForecastBeanList = new ArrayList<>();

       for(Daily dailyForecast : resultBean.getDaily()){

           DailyForecastBean forecastBean =new DailyForecastBean();
           forecastBean.setMinTemp(dailyForecast.getTemp().getMin().toString());
           forecastBean.setMaxTemp(dailyForecast.getTemp().getMax().toString());
           forecastBean.setIcon(dailyForecast.getWeather().get(0).getIcon());
           forecastBean.setDay(dailyForecast.getTemp().getDay().toString());
       /*  forecastBean.setData(Daily.getDt());*/
           dailyForecastBeanList.add(forecastBean);
       }
        return dailyForecastBeanList;
}

    @Activate
    protected void activate(final WeatherServiceDesignate config) {
        enable = config.enable();
        apiKey = config.apiKey();
    }

}
