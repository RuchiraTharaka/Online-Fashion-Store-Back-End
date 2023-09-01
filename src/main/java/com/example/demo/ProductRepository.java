package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT c FROM Product c where c.Category =?1")
    List<Product> getItemList(int Category);

}
