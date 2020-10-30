package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        customer.setID(12);
        customer.setStatus(false);
        customer.setTotal(2020.15);
        customer.displayCustomerInfo();
    }
}
