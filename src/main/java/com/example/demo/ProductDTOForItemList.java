package com.example.demo;

public class ProductDTOForItemList {

    public int Id;

    public String Name;

    public int Price;

    public String Image;

    public ProductDTOForItemList(int id, String name, int price, String image) {
        Id = id;
        Name = name;
        Price = price;
        Image = image;
    }

    @Override
    public String toString() {
        return "ProductDTOForItemList{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Images='" + Image + '\'' +
                '}';
    }
}
