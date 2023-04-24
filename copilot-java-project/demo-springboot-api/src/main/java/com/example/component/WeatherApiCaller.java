package com.example.component;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.model.WeatherData;

//create a component to call weather api
@Component
public class WeatherApiCaller {
    // inject a rest template
    @Autowired
    private RestTemplate restTemplate;

    // create a method to call weather api with rest template
    public String callWeatherApi() {
        // call weather api with rest template
        // return the result
        return restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=2de143494c0b295cca9337e1e96b00e0",
                String.class);
    }

    // create a method 'callW' to call api with get method, api is
    // 'https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13'
    public String callW() {
        // format below codes
        // call weather api with rest template with 3 headers
        // return the result
        String api = "https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13";
        // first header is 'X-RapidAPI-Key' , get value from environment variable 'RAPID_API_KEY'
        String firstHeader = "X-RapidAPI-Key";
        // create a variable apiKey with value from environment variable 'RAPID_API_KEY'
        String apiKey = System.getenv("RAPID_API_KEY");
        // second header is '"X-RapidAPI-Host' value is "weatherapi-com.p.rapidapi.com"
        String secondHeader = "X-RapidAPI-Host";
        // thrid header is 'Content-Type' value is 'application/octet-stream'
        String thirdHeader = "Content-Type";
        // use rest template to call api with 3 headers , method is get
        // return the result
        // return restTemplate.getForObject(api, String.class, firstHeader,
        // apiKey, secondHeader,
        // "weatherapi-com.p.rapidapi.com");
        // use rest template exchange method to call api with 3 headers , method is get
        // create a request entity with the 3 headers on above
        // RequestEntity requestEntity = RequestEntity.get(api)
        // .header(firstHeader, apiKey)
        // .header(secondHeader, "weatherapi-com.p.rapidapi.com").header(thirdHeader,
        // "application/octet-stream")
        // .build();
        RequestEntity requestEntity = RequestEntity.get(URI.create(api))
                .header(firstHeader, apiKey)
                .header(secondHeader, "weatherapi-com.p.rapidapi.com").header(thirdHeader, "application/octet-stream")
                .build();
        return restTemplate.exchange(requestEntity, String.class).getBody();
        // return
        // restTemplate.getForObject("https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13",
        // String.class);
    }

    // auto inject a weather data parser
    @Autowired
    private WeatherDataParser weatherDataParser;
    public WeatherData callWeatherApiAndParse() {
        // call weather api with rest template
        // parse the result
        // return the result
        String result = callW();
        return weatherDataParser.parseWeatherData(result);
    }
}
