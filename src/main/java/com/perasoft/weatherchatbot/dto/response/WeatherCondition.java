package com.perasoft.weatherchatbot.dto.response;

import lombok.Data;

@Data
public class WeatherCondition {

    private String text;
    private String icon;
    private Integer code;
}
