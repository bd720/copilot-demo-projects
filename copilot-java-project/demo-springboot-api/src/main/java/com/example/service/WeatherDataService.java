package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.WeatherDataEntity;
import com.example.repository.WeatherDataRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WeatherDataService {
    //auto inject WeatherDataRepository
    @Autowired
    private WeatherDataRepository weatherDataRepository;

    //create a method to save weather data
    //return the saved weather data
    public WeatherDataEntity saveWeatherData(WeatherDataEntity weatherData) {
        //log the city and date and temperature
        log.info("city: " + weatherData.getCity() + ", date: " + weatherData.getDate() + ", temperature: " + weatherData.getTemperature());
        return weatherDataRepository.save(weatherData);
    }
    //create a method to get weather data by city
    //return the list of weather data
    public List<WeatherDataEntity> getWeatherDataByCity(String city) {
        return weatherDataRepository.findByCity(city);
    }

    //create a method to get weather data by city and date
    //return the weather data
    public WeatherDataEntity getWeatherDataByCityAndDate(String city, String date) {
        return weatherDataRepository.findByCityAndDate(city, date);
    }
    public WeatherDataEntity getLatestWeatherDataByCity(String city) {
        //get all weather data by city
        List<WeatherDataEntity> weatherDataList = weatherDataRepository.findByCity(city);
        //sort data by date field
        //get the latest entry
        weatherDataList.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
        // and return latest entry
        
        if (weatherDataList != null && weatherDataList.size() > 0) {
            return weatherDataList.get(weatherDataList.size() - 1);
        }
        return null;
    }

}
