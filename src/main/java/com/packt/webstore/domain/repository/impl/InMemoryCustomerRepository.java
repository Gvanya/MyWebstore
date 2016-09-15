package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;

import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private List<Customer> listOfCustomers = new ArrayList<Customer>();

    public InMemoryCustomerRepository() {
        Customer cust1 = new Customer("0001","Semen", "Belova Street", false);
        Customer cust2 = new Customer("0002","Sergei", "Rokos Street", false);
        Customer cust3 = new Customer("0003","Dima", "Mira Street", false);

        listOfCustomers.add(cust1);
        listOfCustomers.add(cust2);
        listOfCustomers.add(cust3);
    }

    public List<Customer> getAllCustomers(){
        return listOfCustomers;
    }

}
