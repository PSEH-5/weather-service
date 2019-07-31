
package com.sapient.weather.predicator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "deg"
})
public class Wind {

    @JsonProperty("speed")
    private Float speed;
    @JsonProperty("deg")
    private Float deg;

    @JsonProperty("speed")
    public Float getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public Float getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(Float deg) {
        this.deg = deg;
    }

}
