package config;

import model.CarFactory;
import model.Toyota;
import model.ToyotaSupra;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
    @Bean
    CarFactory getCar(){
        CarFactory carFactory=new CarFactory();
        carFactory.setToyota(getToyotaSupra());
        return carFactory;
    }

    @Bean
    Toyota getToyota(){
        return new Toyota();
    }
    @Bean
    ToyotaSupra getToyotaSupra(){
        return new ToyotaSupra();
    }

}
