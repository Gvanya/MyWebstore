package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;

public interface CustomerRepository {
    void saveCustomer(Customer customer);
    Customer getCustomer(String customerId);
    Boolean isCustomerExist(String customerId);
}
