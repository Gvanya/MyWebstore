package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import com.packt.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.saveCustomer(customer);
    }

    @Override
    public Customer getCustomer(String customerId) {
        return customerRepository.getCustomer(customerId);
    }

    @Override
    public Boolean isCustomerExist(String customerId) {
        return customerRepository.isCustomerExist(customerId);
    }
}