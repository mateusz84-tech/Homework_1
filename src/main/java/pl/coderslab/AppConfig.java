package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.SimpleCustomerLogger;

@Configuration

public class AppConfig {

    // zadanie 2
    @Bean
    public SimpleCustomerLogger scl(){

        return new SimpleCustomerLogger();
    }
}
