
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
    "USD"
})
@Generated("jsonschema2pojo")
public class Quote__1 implements Serializable
{

    @JsonProperty("USD")
    private Usd__1 usd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
<<<<<<< HEAD
    private final static long serialVersionUID = -1064994701816146182L;
=======
    private final static long serialVersionUID = 1774430573853231495L;
>>>>>>> aee500f36079cb89f1b54b02a77861f49894cac4

    @JsonProperty("USD")
    public Usd__1 getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Usd__1 usd) {
        this.usd = usd;
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
