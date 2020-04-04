package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.CustomerLogger;

import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;


public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // zadanie 2
       SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);
       simpleCustomerLogger.log();

       // zadanie 3

        MemoryCustomerRepository mcr = context.getBean(MemoryCustomerRepository.class);
        mcr.addCustomer(new Customer(1,"M","K"));
        mcr.getList();

        context.close();
    }
}
