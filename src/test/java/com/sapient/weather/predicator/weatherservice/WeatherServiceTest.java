package com.sapient.weather.predicator.weatherservice;


import com.sapient.weather.predicator.model.Wresponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WeatherService.class})
public class WeatherServiceTest {

    @Autowired
    WeatherService weatherService;

    @Test
    public void testGetWeatherCity(){


        Wresponse s = weatherService.getCityWeahter("London");
        System.out.println("s = " + s);

        Assert.assertNotNull(s);



    }

}
