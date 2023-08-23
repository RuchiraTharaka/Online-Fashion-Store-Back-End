package com.example.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;
    @Column
    public String Name;
    @Column
    public int Category;
    @Column
    public String Description;
    @Column
    public int Price;
    @ElementCollection
    public List<String> Sizes;
    @ElementCollection
    public List<String> Images;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Category=" + Category +
                ", Description='" + Description + '\'' +
                ", Price=" + Price +
                ", Sizes=" + Sizes +
                ", Images=" + Images +
                '}';
    }

    public Product(int id, String name, int category, String description, int price, ArrayList<String> sizes, ArrayList<String> images) {
        Id = id;
        Name = name;
        Category = category;
        Description = description;
        Price = price;
        Sizes = sizes;
        Images = images;
    }

}
