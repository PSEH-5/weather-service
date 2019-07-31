package com.sapient.weather.predicator.weatherservice;

import com.sapient.weather.predicator.model.Wresponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("stubMyService")
@Slf4j
public class StubMyService {

    public Wresponse getCityWeahter(String cityName) {

        log.error(" server is down ");
        return null;

    }
}
