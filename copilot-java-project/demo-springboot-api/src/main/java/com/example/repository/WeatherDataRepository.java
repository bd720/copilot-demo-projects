package com.example.repository;
//create a repository to store weather data

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.WeatherDataEntity;


@Repository
public interface WeatherDataRepository extends JpaRepository<WeatherDataEntity, Long> {

    List<WeatherDataEntity> findByCity(String city);

    //get one entity by city and date
    WeatherDataEntity findByCityAndDate(String city, String date);
    
}