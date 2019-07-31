package com.sapient.weather.predicator.model;

import java.io.Serializable;

public class Wresponse implements Serializable {

    public  Wresponse(){

    }
    public  Wresponse(String string){

        this.exp =string;
    }


    public Wresponse(String minTemp, String maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    private String exp ;

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getExp() {
        return exp;
    }

    private  String minTemp;
    private  String maxTemp;

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public String getMinTemp() {
        return minTemp;
    }
}
