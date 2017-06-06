package com.learning.service;

import com.learning.model.Customer;
import com.learning.repository.CustomerRepository;

import java.util.List;

/**
 * Created by ahmadhassan on 6/6/17.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


}
