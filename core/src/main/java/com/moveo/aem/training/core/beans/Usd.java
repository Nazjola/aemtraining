
package com.moveo.aem.training.core.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "price",
    "volume_24h",
    "percent_change_1h",
    "percent_change_24h",
    "percent_change_7d",
    "percent_change_30d",
    "market_cap",
    "last_updated"
})
@Generated("jsonschema2pojo")
public class Usd implements Serializable
{

    @JsonProperty("price")
    private Double price;
    @JsonProperty("volume_24h")
    private Double volume24h;
    @JsonProperty("percent_change_1h")
    private Double percentChange1h;
    @JsonProperty("percent_change_24h")
    private Double percentChange24h;
    @JsonProperty("percent_change_7d")
    private Double percentChange7d;
    @JsonProperty("percent_change_30d")
    private Double percentChange30d;
    @JsonProperty("market_cap")
    private Double marketCap;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
<<<<<<< HEAD
    private final static long serialVersionUID = 320635525793394760L;
=======
    private final static long serialVersionUID = -4529931081636836160L;
>>>>>>> aee500f36079cb89f1b54b02a77861f49894cac4

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("volume_24h")
    public Double getVolume24h() {
        return volume24h;
    }

    @JsonProperty("volume_24h")
    public void setVolume24h(Double volume24h) {
        this.volume24h = volume24h;
    }

    @JsonProperty("percent_change_1h")
    public Double getPercentChange1h() {
        return percentChange1h;
    }

    @JsonProperty("percent_change_1h")
    public void setPercentChange1h(Double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    @JsonProperty("percent_change_24h")
    public Double getPercentChange24h() {
        return percentChange24h;
    }

    @JsonProperty("percent_change_24h")
    public void setPercentChange24h(Double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    @JsonProperty("percent_change_7d")
    public Double getPercentChange7d() {
        return percentChange7d;
    }

    @JsonProperty("percent_change_7d")
    public void setPercentChange7d(Double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    @JsonProperty("percent_change_30d")
    public Double getPercentChange30d() {
        return percentChange30d;
    }

    @JsonProperty("percent_change_30d")
    public void setPercentChange30d(Double percentChange30d) {
        this.percentChange30d = percentChange30d;
    }

    @JsonProperty("market_cap")
    public Double getMarketCap() {
        return marketCap;
    }

    @JsonProperty("market_cap")
    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
