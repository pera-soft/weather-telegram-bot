package com.perasoft.weatherchatbot.service.weatherprovider;

import com.perasoft.weatherchatbot.dto.response.SimpleWeatherInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherProviderFactory {

    private final List<WeatherProvider> weatherProviders;

    public SimpleWeatherInformation getWeatherInfo(Double latitude, Double longitude, String language) {
        for (WeatherProvider weatherProvider : weatherProviders) {
            try {
                return weatherProvider.getWeatherInformation(latitude, longitude, language);
            } catch (Exception ignored) {
            }
        }

        throw new RuntimeException("");
    }
}
