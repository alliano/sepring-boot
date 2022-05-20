package com.sprig.mvc.firstapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bigData")
public class Database {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10, unique = true, nullable = false)
    private String code;
    @Column(nullable = false,length = 255)
    private String name;
    @Column(nullable = false)
    private double price;

    
    public Database() {
    }

    public Long setId(Long id) {
        return this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String setCode(String code) {
        return this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double setPrice(double price) {
        return this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
