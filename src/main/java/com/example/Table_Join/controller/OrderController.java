package com.example.Table_Join.controller;


import com.example.Table_Join.dao.CustomerRepository;
import com.example.Table_Join.dto.Request;
import com.example.Table_Join.model.Customer;
import com.example.Table_Join.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/orders")
    public List<Customer> Orders()
    {
        return customerService.Orders();
    }

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody Request request)
    {
        return customerService.placeOrder(request);
    }

}
