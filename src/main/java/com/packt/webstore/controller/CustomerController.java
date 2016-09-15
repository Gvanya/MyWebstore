package com.packt.webstore.controller;

import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/customers")
    public String customer(Model model){
        model.addAttribute("customers", customerRepository.getAllCustomers());
        return "customers";
    }
}
