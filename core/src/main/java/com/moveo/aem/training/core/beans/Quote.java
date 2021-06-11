
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
public class Quote implements Serializable
{

    @JsonProperty("USD")
    private Usd usd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
<<<<<<< HEAD
    private final static long serialVersionUID = -5458629074776593215L;
=======
    private final static long serialVersionUID = 5139213066973260163L;
>>>>>>> aee500f36079cb89f1b54b02a77861f49894cac4

    @JsonProperty("USD")
    public Usd getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Usd usd) {
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
