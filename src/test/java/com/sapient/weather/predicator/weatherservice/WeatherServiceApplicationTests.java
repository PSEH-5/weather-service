package com.sapient.weather.predicator.weatherservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class WeatherServiceApplicationTests {

    @Autowired
    WeatherService weatherService;

    @Test
    public void contextLoads() {
        weatherService.getCityWeahter("");
    }

}
