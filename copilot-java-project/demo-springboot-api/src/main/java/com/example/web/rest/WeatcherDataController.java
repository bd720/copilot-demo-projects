package com.example.web.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
//create web api controller
import org.springframework.web.bind.annotation.RestController;

import com.example.component.WeatherApiCaller;
//add logger
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class WeatcherDataController {
    //create api to get weather data for a city
    //create api to get weather data for a city for a given date
    //create api to get weather data for a city for a given date range
    //create api to get weather data for a city for a given date range and time range
    @RequestMapping("/weatherdata")
    public String getWeatherData() {
        return "Hello World!";
    }

    //inject the weather api caller
    // @RequestMapping("/weatherdata2")
    
    //inject the weather api caller
    @Autowired
    private WeatherApiCaller weatherApiCaller;

    //create api to allow 'get' request to get weather data for a city
    //request path is 'getweather'
    @RequestMapping("/getweather")
    public String getWeatherData2() {
        //call weather api
        String weatherData = weatherApiCaller.callWeatherApi();
        //return the result
        return weatherData;
    }

    //create api 'getWV2' to allow 'get' request to get data via weather api caller method 'callW'
    @RequestMapping("/getWV2")
    public String getWV2() {
        //call weather api
        String weatherData = weatherApiCaller.callW();
        //return the result
        //log the result
        log.info("weather data is: " + weatherData);
        return weatherData;
    }
}
