package com.perasoft.weatherchatbot.dto.response;

import lombok.Data;

@Data
public class SimpleWeatherInformation {

    private String city;

    private String condition;

    private String iconPath;

    private String temperature;
}
