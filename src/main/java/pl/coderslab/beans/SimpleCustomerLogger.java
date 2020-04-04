package pl.coderslab.beans;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log() {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime + ": Customer operation");
    }
}
