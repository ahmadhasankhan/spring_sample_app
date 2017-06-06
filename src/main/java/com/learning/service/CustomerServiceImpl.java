package com.learning.service;

import com.learning.model.Customer;
import com.learning.repository.CustomerRepository;
import com.learning.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by ahmadhassan on 6/6/17.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
