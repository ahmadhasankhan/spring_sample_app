package com.learning;

import com.learning.service.CustomerService;
import com.learning.service.CustomerServiceImpl;

/**
 * Created by ahmadhassan on 6/6/17.
 */
public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getLast_name());
    }
}
