package com.example.Table_Join.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@ToString   
@Entity
public class Customer {

    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String gender;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "custpro_fk", referencedColumnName = "id")
    private List<Product> product;
}
