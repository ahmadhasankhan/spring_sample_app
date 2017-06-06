package com.learning.repository;

import com.learning.model.Customer;

import java.util.List;

/**
 * Created by ahmadhassan on 6/6/17.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
