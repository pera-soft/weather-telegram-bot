![weatherbot](/images/weatherbot.png)

### What Does WeatherBot? 

When you send your locaion on telegram, **weatherbot** showed at the moment weather condition.

## Built With They
[![Java][Java]][Java-url]
[![Spring][Spring]][Spring-url] 
[![Telegram][Telegram]][Telegram-url]
[![Weather][Weather]][Weather-url]
[![Idea][Idea]][Idea-url]

## How Works

![architecture](/images/architecture.png)

## Configuration

### Telegram
Open Your telegram app and find telegram **BotFather** and write these word respectively
```
/start -> for starting 

/newbot -> for creating new bot

```

You will then be prompted to name your newly created bot.
```
WeatherApi
```

Then you will be prompted to pick a username of the bot that must be unique and also end in bot.   

```
WeatherApi_bot
```

That is it, a token will be given to you when all transactions are finished. This unique code required for spring boot.

### Spring Boot Dependencies For Telegram

```
<dependency>
    <groupId>org.telegram</groupId>
    <artifactId>telegrambots-spring-boot-starter</artifactId>
    <version>6.1.0</version>
</dependency>
```

```
<dependency>
    <groupId>org.telegram</groupId>
    <artifactId>telegrambots</artifactId>
    <version>${telegram.version}</version>
</dependency>

```
	
### Weather Api 
In this project we used the [Weather Api](https://www.weatherapi.com), if you use this api, they give api token for the request. When you send latitude and longitude they give json objest about wheather status.
Of course, you can include other apis.

### Example
<img src="/images/example.jpeg"  width="50%" height="50%">

## Contact 

- Oğuzhan Çevik - [@oguzhancevik](https://github.com/oguzhancevik)

- Arda Ağdemir - [@ardaagdemir](https://github.com/ardaagdemir)

- Ahmet Tayyip Müjde - [@ahmetmujde](https://github.com/ahmetmujde)




[Weather-url]: https://www.weatherapi.com
[Weather]: /images/weather_api.svg
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com
[Idea-url]: https://www.jetbrains.com/idea/
[Idea]: https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white
[Telegram]: https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white
[Telegram-url]: https://telegram.org/
[Spring]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/  


