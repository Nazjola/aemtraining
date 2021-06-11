package com.moveo.aem.training.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name="AEMTraining Coin Market",
        description = "Coin Market")
public @interface CoinMarketServiceDesignate {

    @AttributeDefinition(name = "Enabled",
            description = "Enabled")
    boolean enable() default true;

    @AttributeDefinition(name = "API Key",
            description = "contains api key from the coinmarketcap")
    String apiKey() default "fb85e4f7-3aa0-46f7-b47e-50ee6103c3e0";

}
