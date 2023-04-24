package com.example.component;

import com.example.model.WeatherData;
import com.example.model.WeatherModeData;

public class WeatherDataParserTest {
    // test the weather data parser method 'parseWeatherData'
    // create a test to test the method 'parseWeatherData'
    //@Test
    public void testParseWeatherData() {
        // create a weather data parser
        // create a weather data
        // parse the weather data
        // assert the weather data
        WeatherDataParser weatherDataParser = new WeatherDataParser();
        WeatherData  data = weatherDataParser.parseWeatherData("weatherData");
        System.out.println(data);
    }
}
