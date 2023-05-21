package com.perasoft.weatherchatbot.dto.response;

import lombok.Data;

@Data
public class WeatherLocation {

    private String name;
    private String region;
    private String country;
    private Double lat;
    private Double lon;
    private String tz_id;
    private Integer localtime_epoch;
    private String localtime;
}
