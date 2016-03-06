
package com.gradebook.DO;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Category",
    "Percentage"
})
public class GradeItem {

    @JsonProperty("Category")
    private String Category;
    @JsonProperty("Percentage")
    private String Percentage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Category
     */
    @JsonProperty("Category")
    public String getCategory() {
        return Category;
    }

    /**
     * 
     * @param Category
     *     The Category
     */
    @JsonProperty("Category")
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * 
     * @return
     *     The Percentage
     */
    @JsonProperty("Percentage")
    public String getPercentage() {
        return Percentage;
    }

    /**
     * 
     * @param Percentage
     *     The Percentage
     */
    @JsonProperty("Percentage")
    public void setPercentage(String Percentage) {
        this.Percentage = Percentage;
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
