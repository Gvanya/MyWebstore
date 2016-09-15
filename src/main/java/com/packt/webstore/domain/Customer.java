package com.packt.webstore.domain;

/**
 * Created by ivan on 05.09.2016.
 */
public class Customer {

    private String customerId;
    private String name;
    private String address;
    private boolean noOfOrdersMade;

    public Customer(String customerId, String name, String address, boolean noOfOrdersMade) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean isNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNoOfOrdersMade(boolean noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", noOfOrdersMade=" + noOfOrdersMade +
                '}';
    }
}
