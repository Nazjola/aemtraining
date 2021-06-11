package com.moveo.aem.training.core.services;

import com.moveo.aem.training.core.schedulers.SimpleScheduledTask;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name="AEMTraining Weather Forecast",
        description = "Simple weather forecast")
public @interface WeatherServiceDesignate{

    @AttributeDefinition(name = "Enabled",
            description = "Enabled")
    boolean enable() default true;

    @AttributeDefinition(name = "API Key",
            description = "contains api key from the weather app")
    String apiKey() default "6a64d0b020287b37ae6ec083064e5a86";

}
