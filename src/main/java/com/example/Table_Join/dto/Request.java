package com.example.Table_Join.dto;

import com.example.Table_Join.model.Customer;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {

    private Customer customer;
}
