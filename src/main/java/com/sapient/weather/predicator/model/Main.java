
package com.sapient.weather.predicator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temp",
    "temp_min",
    "temp_max",
    "pressure",
    "sea_level",
    "grnd_level",
    "humidity",
    "temp_kf"
})
public class Main {

    @JsonProperty("temp")
    private Float temp;
    @JsonProperty("temp_min")
    private Float tempMin;
    @JsonProperty("temp_max")
    private Float tempMax;
    @JsonProperty("pressure")
    private Float pressure;
    @JsonProperty("sea_level")
    private Float seaLevel;
    @JsonProperty("grnd_level")
    private Float grndLevel;
    @JsonProperty("humidity")
    private Long humidity;
    @JsonProperty("temp_kf")
    private Long tempKf;

    @JsonProperty("temp")
    public Float getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Float temp) {
        this.temp = temp;
    }

    @JsonProperty("temp_min")
    public Float getTempMin() {
        return tempMin;
    }

    @JsonProperty("temp_min")
    public void setTempMin(Float tempMin) {
        this.tempMin = tempMin;
    }

    @JsonProperty("temp_max")
    public Float getTempMax() {
        return tempMax;
    }

    @JsonProperty("temp_max")
    public void setTempMax(Float tempMax) {
        this.tempMax = tempMax;
    }

    @JsonProperty("pressure")
    public Float getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("sea_level")
    public Float getSeaLevel() {
        return seaLevel;
    }

    @JsonProperty("sea_level")
    public void setSeaLevel(Float seaLevel) {
        this.seaLevel = seaLevel;
    }

    @JsonProperty("grnd_level")
    public Float getGrndLevel() {
        return grndLevel;
    }

    @JsonProperty("grnd_level")
    public void setGrndLevel(Float grndLevel) {
        this.grndLevel = grndLevel;
    }

    @JsonProperty("humidity")
    public Long getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("temp_kf")
    public Long getTempKf() {
        return tempKf;
    }

    @JsonProperty("temp_kf")
    public void setTempKf(Long tempKf) {
        this.tempKf = tempKf;
    }

}
