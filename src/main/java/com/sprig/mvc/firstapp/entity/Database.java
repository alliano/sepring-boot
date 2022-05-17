package com.sprig.mvc.firstapp.entity;

public class Database {
    private Long id;
    private String code;
    private String name;
    private double price;

    public Database (Long id, String code, String name, double price){
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public Database() {}

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
