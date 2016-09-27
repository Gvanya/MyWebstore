package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    Map<String, Customer> listOfCustomers;

    public InMemoryCustomerRepository(){
        listOfCustomers = new HashMap<>();
    }

    @Override
    public void saveCustomer(Customer customer) {
        if (listOfCustomers.keySet().contains(customer.getCustomerId())){
            throw new IllegalArgumentException("customer already exist");
        }
        listOfCustomers.put(customer.getCustomerId(), customer);
    }

    @Override
    public Customer getCustomer(String customerId) {
        return listOfCustomers.get(customerId);
    }

    @Override
    public Boolean isCustomerExist(String customerId) {
        return listOfCustomers.containsKey(customerId);
    }
}