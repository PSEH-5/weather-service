package com.sapient.weather.predicator.weatherservice;


import com.sapient.weather.predicator.model.Response;
import com.sapient.weather.predicator.model.Wresponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service("weatherService")
public class WeatherService {


    public Wresponse getCityWeahter(String cityName) {

        Wresponse whetherReport = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            final String baseUrl = "https://samples.openweathermap.org/data/2.5/forecast?q=" + cityName + ",us&&appid=b6907d289e10d714a6e88b30761fae22";
            URI uri = new URI(baseUrl);

            Response response = restTemplate.getForObject(uri, Response.class);

            java.util.List<com.sapient.weather.predicator.model.List> mains = response.getList();

            for (int i = 0; i < 3; i++) {
                if (mains.get(i).getWeather().get(0).getDescription().contains("Rain")) {
                    return new Wresponse("Carry Umbrella");
                }
            }

            Float minTemp = Float.MAX_VALUE;
            Float maxTemp = Float.MIN_VALUE;

            Double avgTemp = mains.stream().limit(3).mapToDouble(e -> e.getMain().getTemp()).sum() / 3;
            for (int i = 0; i < 3; i++) {
                if (mains.get(i).getMain().getTempMin() < minTemp) {
                    minTemp = mains.get(i).getMain().getTempMin();
                }
            }

            for (int i = 0; i < 3; i++) {
                if (mains.get(i).getMain().getTempMin() > maxTemp) {
                    maxTemp = mains.get(i).getMain().getTempMin();
                }
            }


            if (avgTemp >= 313.15) {
                return new Wresponse("Use sunscreen lotion");
            }


            return new Wresponse(minTemp.toString(), maxTemp.toString());


        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

}
