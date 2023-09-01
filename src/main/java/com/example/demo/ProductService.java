package com.example.demo;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
public interface ProductService {


    List<ProductDTOForItemList> getItemList(int categoryId) ;

    Product getProductDetails(int categoryId, String productId);

    int getItemListLength(int categoryId) ;

    @Transactional
    int saveItem(Product product);

    @Transactional
    int updateItem(ProductDTOForUpdating productDTO);

    @Transactional
    void removeItem(int productId);
}
