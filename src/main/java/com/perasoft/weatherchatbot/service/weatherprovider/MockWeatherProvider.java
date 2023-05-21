package com.perasoft.weatherchatbot.service.weatherprovider;

import com.perasoft.weatherchatbot.dto.response.SimpleWeatherInformation;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
@Profile("test")
public class MockWeatherProvider implements WeatherProvider {

    @Override
    public SimpleWeatherInformation getWeatherInformation(Double latitude, Double longitude, String language) {
        SimpleWeatherInformation simpleWeatherInformation = new SimpleWeatherInformation();
        simpleWeatherInformation.setCity("London");
        simpleWeatherInformation.setTemperature("20");
        simpleWeatherInformation.setCondition("Cloud");
        simpleWeatherInformation.setIconPath("//cdn.weatherapi.com/weather/64x64/day/116.png");
        return simpleWeatherInformation;
    }
}
