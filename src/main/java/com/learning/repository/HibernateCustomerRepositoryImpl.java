package com.learning.repository;

import com.learning.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmadhassan on 6/6/17.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirst_name("Ahmad");
        customer.setLast_name("Hassan");

        customers.add(customer);

        return customers;
    }
}
