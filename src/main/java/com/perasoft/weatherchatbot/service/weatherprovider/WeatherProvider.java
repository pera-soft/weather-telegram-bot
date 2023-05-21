package com.perasoft.weatherchatbot.service.weatherprovider;

import com.perasoft.weatherchatbot.dto.response.SimpleWeatherInformation;

public interface WeatherProvider {

   SimpleWeatherInformation getWeatherInformation(Double latitude, Double longitude, String language);
}
