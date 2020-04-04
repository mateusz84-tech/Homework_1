package pl.coderslab.beans;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(Customer customer);
    void removeCustomer(int id);
    List<Customer> getList();
}
