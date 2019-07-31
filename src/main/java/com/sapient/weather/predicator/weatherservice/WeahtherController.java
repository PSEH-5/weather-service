package com.sapient.weather.predicator.weatherservice;


import com.sapient.weather.predicator.model.Wresponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
@RequestMapping("/get/weather")
public class WeahtherController {


    @Autowired
    WeatherService weatherService;

    @GetMapping("/{city}")
    public Wresponse employeeOverview(@PathVariable("city") String cityName) {

        return weatherService.getCityWeahter(cityName);
    }



}