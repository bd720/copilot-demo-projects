package com.example.model;
/**
 * create a model to store weather data
 */
public class WeatherModeData {
    private String city;
    private String date;
    //create temperature field
    private String temperature;
    //create humidity field
    private String humidity;
    //create pressure field
    private String pressure;
    //create wind speed field
    private String windSpeed;
    
    //create getters and setters for all fields
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    //create getters and setters for all fields
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    //create getters and setters for all fields
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    //create getters and setters for all fields
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    //create getters and setters for all fields
    public String getPressure() {
        return pressure;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    //create getters and setters for all fields
    public String getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
    // //create getters and setters for all fields
    // public String getWindDirection() {
    //     return windDirection;
    // }
    // copilot is stupid as it does generate the getters and setters for unknown fields
}
