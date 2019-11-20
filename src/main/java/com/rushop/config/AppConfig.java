package com.rushop.config;

import com.rushop.model.Turtle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Turtle turtle(){
        Turtle turtle = new Turtle();
        // logic
        turtle.setName("Donatello");
        return turtle;
    }
}
