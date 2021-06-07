package com.moveo.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


@Model(adaptables = Resource.class)
public class WeatherModel {

    @Inject
    private String latitude;

    @Inject
    private String longitude;

    private static final Logger LOG = LoggerFactory.getLogger(WeatherModel.class);

    @PostConstruct
    protected void init() {

        LOG.debug("WeatherModel instanciated lat {} lon {}" , latitude, longitude);
    }



}
