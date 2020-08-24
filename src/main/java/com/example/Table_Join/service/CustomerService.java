package com.example.Table_Join.service;

import com.example.Table_Join.dao.CustomerRepository;
import com.example.Table_Join.dto.Request;
import com.example.Table_Join.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> Orders()
    {
        return customerRepository.findAll();
    }

    public Customer placeOrder(Request request)
    {
        return customerRepository.save(request.getCustomer());
    }

}
