package com.perasoft.weatherchatbot.dto.response;

import lombok.Data;

@Data
public class WeatherInformation {

    private Integer last_updated_epoch;
    private String last_updated;
    private Double temp_c;
    private Double temp_f;
    private Integer is_day;
    private WeatherCondition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Integer wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Integer humidity;
    private Integer cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double vis_km;
    private Double vis_miles;
    private Double uv;
    private Double gust_mph;
    private Double gust_kph;
}
