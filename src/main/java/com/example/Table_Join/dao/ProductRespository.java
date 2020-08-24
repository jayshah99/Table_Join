package com.example.Table_Join.dao;

import com.example.Table_Join.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Integer> {

}
