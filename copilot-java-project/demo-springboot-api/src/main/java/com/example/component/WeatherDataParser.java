package com.example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.WeatherData;
import com.example.model.WeatherModeData;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.apachecommons.CommonsLog;

@Component
public class WeatherDataParser {
    //inject object mapper
    @Autowired
    private ObjectMapper objectMapper;

    //create a method to parse weather data into model 'WeatherData'
    //return the model
    public WeatherData parseWeatherData(String weatherData) {
        //create a model
        WeatherData weather = null;
        try {
            //parse weather data into model
            weather = objectMapper.readValue(weatherData, WeatherData.class);
        } catch (Exception e) {
            //log the error
            //throw the error
        }
        //return the model
        return weather;
    }
}
