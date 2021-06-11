
package com.moveo.aem.training.core.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "id",
    "name",
    "symbol",
    "slug",
    "is_active",
    "is_fiat",
    "circulating_supply",
    "total_supply",
    "max_supply",
    "date_added",
    "num_market_pairs",
    "cmc_rank",
    "last_updated",
    "tags",
    "platform",
    "quote"
})
@Generated("jsonschema2pojo")
public class Eth implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("is_active")
    private Integer isActive;
    @JsonProperty("is_fiat")
    private Object isFiat;
    @JsonProperty("circulating_supply")
    private Integer circulatingSupply;
    @JsonProperty("total_supply")
    private Integer totalSupply;
    @JsonProperty("max_supply")
    private Integer maxSupply;
    @JsonProperty("date_added")
    private String dateAdded;
    @JsonProperty("num_market_pairs")
    private Integer numMarketPairs;
    @JsonProperty("cmc_rank")
    private Integer cmcRank;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("platform")
    private Object platform;
    @JsonProperty("quote")
    private Quote__1 quote;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6750451915744766988L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("is_active")
    public Integer getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("is_fiat")
    public Object getIsFiat() {
        return isFiat;
    }

    @JsonProperty("is_fiat")
    public void setIsFiat(Object isFiat) {
        this.isFiat = isFiat;
    }

    @JsonProperty("circulating_supply")
    public Integer getCirculatingSupply() {
        return circulatingSupply;
    }

    @JsonProperty("circulating_supply")
    public void setCirculatingSupply(Integer circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    @JsonProperty("total_supply")
    public Integer getTotalSupply() {
        return totalSupply;
    }

    @JsonProperty("total_supply")
    public void setTotalSupply(Integer totalSupply) {
        this.totalSupply = totalSupply;
    }

    @JsonProperty("max_supply")
    public Integer getMaxSupply() {
        return maxSupply;
    }

    @JsonProperty("max_supply")
    public void setMaxSupply(Integer maxSupply) {
        this.maxSupply = maxSupply;
    }

    @JsonProperty("date_added")
    public String getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("date_added")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("num_market_pairs")
    public Integer getNumMarketPairs() {
        return numMarketPairs;
    }

    @JsonProperty("num_market_pairs")
    public void setNumMarketPairs(Integer numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    @JsonProperty("cmc_rank")
    public Integer getCmcRank() {
        return cmcRank;
    }

    @JsonProperty("cmc_rank")
    public void setCmcRank(Integer cmcRank) {
        this.cmcRank = cmcRank;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("platform")
    public Object getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    @JsonProperty("quote")
    public Quote__1 getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(Quote__1 quote) {
        this.quote = quote;
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
