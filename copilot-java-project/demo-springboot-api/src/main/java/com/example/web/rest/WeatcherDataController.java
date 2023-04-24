package com.example.web.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//create web api controller
import org.springframework.web.bind.annotation.RestController;

import com.example.component.WeatherApiCaller;
import com.example.model.WeatherData;
import com.example.model.WeatherDataEntity;
import com.example.service.WeatherDataService;

//add logger
import lombok.extern.slf4j.Slf4j;

// allow cors request
@CrossOrigin(origins = "*")
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
    
    //create api 'getWV3' to allow 'get' request to get WeatherData mode via weather api caller method 'callWeatherApiAndParse'
    @RequestMapping("/getWV3")
    // public String getWV3() {
    //     //call weather api
    //     String weatherData = weatherApiCaller.callWeatherApiAndParse();
    //     //return the result
    //     //log the result
    //     log.info("weather data is: " + weatherData);
    //     return weatherData;
    // }
    //return data with model 'WeatherData'
    public WeatherData getWV3() {
        //call weather api
        WeatherData weatherData = weatherApiCaller.callWeatherApiAndParse();
        //return the result
        //log the result
        log.info("weather data is: " + weatherData);

        //save the weatherData to database
        WeatherDataEntity weatherDataEntity = new WeatherDataEntity();
        weatherDataEntity.setCity(weatherData.getLocation().getCountry());
        weatherDataEntity.setDate(weatherData.getCurrent().getLast_updated());
        weatherDataEntity.setTemperature(weatherData.getCurrent ().getTemp_f()+"");
        //use weatherDataService to save the weatherDataEntity
        weatherDataService.saveWeatherData(weatherDataEntity);
        return weatherData;
    }

    // auto inject the weather data service
    @Autowired
    private WeatherDataService weatherDataService;
    
    //create api to get weather data by city path parameter
    // use weather data service to get weather data by city 
    //return the weather data with latest date
    @RequestMapping("/queryByCity/{city}")//copilot didn't know the path variable, this is semi-auto generated
    public WeatherDataEntity getWeatherDataByCity(
    //path parameter 'city'
    // String city) {
    //     return weatherDataService.getLatestWeatherDataByCity(city);
    // }    
    @PathVariable(value = "city")
    String city) {
        return weatherDataService.getLatestWeatherDataByCity(city);
    }
}
