package com.lco.SpringMVCProject.homeController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private String name;
    private int quantity;
    private String brand;
    @JsonIgnore
    private int number;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
@JsonProperty
    public int getNumber() {
        return number;
    }
@JsonIgnore
    public void setNumber(int number) {
        this.number = number;
    }
}
