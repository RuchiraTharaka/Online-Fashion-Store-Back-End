package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;


public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT c FROM Product c where c.Category =?1")
    public List<Product> getItemList(int Category);

////    @Query(value = "SELECT c FROM Product AS C WHERE (c.Category = :Category) AND (c.Id = :ProductId)")
//    @Query(value = "SELECT c FROM Product AS C WHERE c.Category = ?1 AND c.Id = ?2")
//    public List<Product> getProductDetails(int Category, int ProductId);
////    public List<Product> getProductDetails(@Param("Category") int Category, @Param("ProductId") int ProductId);
}
