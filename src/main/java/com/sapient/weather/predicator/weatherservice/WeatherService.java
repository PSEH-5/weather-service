package com.sapient.weather.predicator.weatherservice;


import com.sapient.weather.predicator.model.Response;
import com.sapient.weather.predicator.model.Wresponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service("weatherService")
@Slf4j
public class WeatherService {




    public static final String HTTPS_SAMPLES_OPENWEATHERMAP_ORG_DATA_2_5_FORECAST_Q = "https://samples.openweathermap.org/data/2.5/forecast?q=";
    public static final String RAIN = "Rain";
    public static final String USE_SUNSCREEN_LOTION = "Use sunscreen lotion";
    public static final String CARRY_UMBRELLA = "Carry Umbrella";

    public Wresponse getCityWeahter(String cityName) {

        try {
            RestTemplate restTemplate = new RestTemplate();
            final String baseUrl = HTTPS_SAMPLES_OPENWEATHERMAP_ORG_DATA_2_5_FORECAST_Q + cityName + ",us&&appid=b6907d289e10d714a6e88b30761fae22";
            URI uri = new URI(baseUrl);

            Response response = restTemplate.getForObject(uri, Response.class);

            java.util.List<com.sapient.weather.predicator.model.List> mains = response.getList();

            for (int i = 0; i < 3; i++) {
                if (mains.get(i).getWeather().get(0).getDescription().contains(RAIN)) {
                    return new Wresponse(CARRY_UMBRELLA);
                }
            }

            Float minTemp = Float.MAX_VALUE;
            Float maxTemp = Float.MIN_VALUE;

            Double avgTemp = 0.0;
            for (int i = 0; i < 3; i++) {
                Float tempValue = mains.get(i).getMain().getTempMin();
                if (tempValue < minTemp) {
                    minTemp = tempValue;
                }
                if (tempValue > maxTemp) {
                    maxTemp = tempValue;
                }
                avgTemp += tempValue;
            }

            if (avgTemp/3 >= 313.15) {
                return new Wresponse(USE_SUNSCREEN_LOTION);
            }


            return new Wresponse(minTemp.toString(), maxTemp.toString());


        } catch (URISyntaxException e) {
           log.error(" error is raised while calling rest api");
        }
        return null;
    }

}
