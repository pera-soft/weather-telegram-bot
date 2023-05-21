package com.perasoft.weatherchatbot.service;

import com.perasoft.weatherchatbot.service.weatherprovider.WeatherApiProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class WeatherApiProviderTest {

    private WeatherApiProvider weatherApiProvider;

    @BeforeEach
    void setUp() {
        weatherApiProvider = new WeatherApiProvider();
    }

    @Test
    void shouldGetWeatherInfo() {
        weatherApiProvider.getWeatherInformation(27d, 38d, "tr");
    }
}