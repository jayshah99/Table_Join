package com.example.Table_Join.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    @Column
    private int pid;
    @Column
    private String productname;
    @Column
    private String quantity;
    @Column
    private int price;


}
