package com.example.demo;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@Service
public interface ProductService {


    public List<Product> getItemList(int categoryId) ;

    public Product getProductDetails(int categoryId, String productId);

    public int getItemListLength(int categoryId) ;

    @Transactional
    public int saveItem(Product product);

    @Transactional
    public int updateItem(ProductDTOForUpdating productDTO);

    @Transactional
    public void removeItem(int productId);
}
