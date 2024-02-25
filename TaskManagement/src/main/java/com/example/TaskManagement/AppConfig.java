package com.example.TaskManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.BaseTaskFactory;
@Configuration
public class AppConfig {
    @Bean
    public BaseTaskFactory taskFactory(){
        return new BaseTaskFactory();
    }
}
