package com.example.model;

//create a jpa entity to store weather data with fields
// 'city', 'date', 'temperature', 'humidity', 'pressure', 'windSpeed', 'windDirection'

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeatherDataEntity {
    //create id field
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //create city field
    private String city;
    //create date field
    private String date;
    //create temperature field
    private String temperature;
    //create humidity field
    private String humidity;
    //create pressure field
    private String pressure;
    //create wind speed field
    private String windSpeed;
    //create wind direction field
    private String windDirection;
    //create getters and setters for all fields
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    //create getters and setters for all fields
    public String getWindDirection() {
        return windDirection;
    }
    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }
}

    