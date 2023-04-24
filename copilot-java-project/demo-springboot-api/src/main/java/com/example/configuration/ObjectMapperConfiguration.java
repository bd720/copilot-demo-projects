package com.example.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ObjectMapperConfiguration {
    //setup default object mapper
    //create a method to setup default object mapper
    //return the object mapper
    public ObjectMapper setupDefaultObjectMapper() {
        //create a object mapper
        //return the object mapper
        return new ObjectMapper();
    }
    public ObjectMapperConfiguration() {
        System.out.println("ObjectMapperConfiguration");
    }
}
