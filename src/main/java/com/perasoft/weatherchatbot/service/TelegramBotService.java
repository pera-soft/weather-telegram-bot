package com.perasoft.weatherchatbot.service;

import com.perasoft.weatherchatbot.config.BotConfig;
import com.perasoft.weatherchatbot.dto.response.SimpleWeatherInformation;
import com.perasoft.weatherchatbot.service.weatherprovider.WeatherProviderFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;

@Service
@RequiredArgsConstructor
public class TelegramBotService extends TelegramLongPollingBot {

    private final BotConfig botConfig;
    private final WeatherProviderFactory weatherProviderFactory;

    @Override
    public String getBotUsername() {
        return botConfig.getBotName();
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        onSendLocation(update);
    }


    public void onSendLocation(Update update) {
        if (update.hasMessage() && update.getMessage().hasLocation()) {
            long chatId = update.getMessage().getChatId();
            double latitude = update.getMessage().getLocation().getLatitude();
            double longitude = update.getMessage().getLocation().getLongitude();
            String language = update.getMessage().getFrom().getLanguageCode();

            SimpleWeatherInformation simpleWeatherInformation = weatherProviderFactory.getWeatherInfo(latitude, longitude, language);
            showWeatherLocationWithImage(chatId, simpleWeatherInformation);
        }
    }

    private void showWeatherLocationWithImage(long chatId, SimpleWeatherInformation simpleWeatherInformation) {
        try {
            int startIndex = 20;
            String iconPath = simpleWeatherInformation.getIconPath().substring(startIndex);
            String path = "static" + iconPath;

            String caption = simpleWeatherInformation.getCity() + ": " + simpleWeatherInformation.getCondition() + " " +
                    simpleWeatherInformation.getTemperature() + " °C ";

            File image = ResourceUtils.getFile("classpath:" + path);
            InputFile inputFileImage = new InputFile(image);
            SendPhoto sendPhoto = new SendPhoto();
            sendPhoto.setPhoto(inputFileImage);
            sendPhoto.setChatId(chatId);
            sendPhoto.setCaption(caption);
            execute(sendPhoto);
        } catch (Exception exception) {
            throw new RuntimeException("");
        }
    }

}
