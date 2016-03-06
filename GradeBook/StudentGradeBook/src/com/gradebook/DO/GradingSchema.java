
package com.gradebook.DO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "GradeItem"
})
public class GradingSchema {

    @JsonProperty("GradeItem")
    private List<com.gradebook.DO.GradeItem> GradeItem = new ArrayList<com.gradebook.DO.GradeItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The GradeItem
     */
    @JsonProperty("GradeItem")
    public List<com.gradebook.DO.GradeItem> getGradeItem() {
        return GradeItem;
    }

    /**
     * 
     * @param GradeItem
     *     The GradeItem
     */
    @JsonProperty("GradeItem")
    public void setGradeItem(List<com.gradebook.DO.GradeItem> GradeItem) {
        this.GradeItem = GradeItem;
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
