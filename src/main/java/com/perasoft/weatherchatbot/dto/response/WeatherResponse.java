package com.perasoft.weatherchatbot.dto.response;

import lombok.Data;

@Data
public class WeatherResponse {

    private WeatherLocation location;
    private WeatherInformation current;
}
