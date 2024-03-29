
package com.sapient.weather.predicator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "3h"
})
public class Snow {

    @JsonProperty("3h")
    private Float _3h;

    @JsonProperty("3h")
    public Float get3h() {
        return _3h;
    }

    @JsonProperty("3h")
    public void set3h(Float _3h) {
        this._3h = _3h;
    }

}
