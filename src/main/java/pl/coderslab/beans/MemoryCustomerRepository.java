package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MemoryCustomerRepository implements CustomerRepository {

    private CustomerLogger customerLogger;
    private Customer customer;
    private List<Customer> customerList = new ArrayList<>();

    public MemoryCustomerRepository(CustomerLogger customerLogger, Customer customer) {
        this.customerLogger = customerLogger;
        this.customer = customer;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        customerLogger.log();

    }

    @Override
    public void removeCustomer(int id) {
        customerList.remove(id);
        customerLogger.log();

    }

    @Override
    public List<Customer> getList() {
        customerLogger.log();
        return customerList;
    }

}

