package pl.coderslab;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.coderslab.beans.*;

@Configuration
@ComponentScan("pl.coderslab.beans")
public class AppConfig {

    // zadanie 2
    @Bean
    public SimpleCustomerLogger simpleCustomerLogger(){

        return new SimpleCustomerLogger();
    }

    // zadanie 3
    @Bean
    Customer customer(){
        return new Customer();
    }

    @Bean
    MemoryCustomerRepository memoryCustomerRepository(){

        return new MemoryCustomerRepository(simpleCustomerLogger(),customer());

    }


}
