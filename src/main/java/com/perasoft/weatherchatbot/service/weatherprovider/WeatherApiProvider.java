package com.perasoft.weatherchatbot.service.weatherprovider;

import com.perasoft.weatherchatbot.dto.response.SimpleWeatherInformation;
import com.perasoft.weatherchatbot.dto.response.WeatherResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Order(2)
public class WeatherApiProvider implements WeatherProvider {

    final String apiKey = "ea6c8f20de164db8ab7181633230805";

    public SimpleWeatherInformation getWeatherInformation(Double latitude, Double longitude, String language) {
        SimpleWeatherInformation information = new SimpleWeatherInformation();

        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri("http://api.weatherapi.com")
                .build();

        String url = "/v1/current.json?key=" + apiKey + "&q=" + latitude + "," + longitude + "&aqi=no&lang=" + language;

        ResponseEntity<WeatherResponse> weatherResponseResponseEntity = restTemplate.getForEntity(url, WeatherResponse.class);

        if (weatherResponseResponseEntity.getStatusCode().is2xxSuccessful()) {

            WeatherResponse body = weatherResponseResponseEntity.getBody();

            if (body != null) {
                information.setCity(body.getLocation().getName());
                information.setCondition(body.getCurrent().getCondition().getText());
                information.setIconPath(body.getCurrent().getCondition().getIcon());
                information.setTemperature(body.getCurrent().getFeelslike_c().toString());
            }

        }
        return information;
    }

}
