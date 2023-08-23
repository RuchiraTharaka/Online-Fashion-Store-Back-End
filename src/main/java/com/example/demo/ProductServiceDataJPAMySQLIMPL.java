package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceDataJPAMySQLIMPL implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getItemList(int categoryId){
        return productRepository.getItemList(categoryId);
    }

    public Product getProductDetails(int categoryId, String productId){
//        return productRepository.getProductDetails(categoryId, Integer.parseInt(productId)).get(0);
        return productRepository.findById(Integer.parseInt(productId)).get();
//        return productRepository.findById(Integer.parseInt(productId)).orElseThrow();
    }

    public int getItemListLength(int categoryId) {
        return productRepository.getItemList(categoryId).size();
    }
    public int saveItem(Product product){
        return productRepository.save(product).Id;
    }

    public int updateItem(ProductDTOForUpdating productDTO){
        productRepository.deleteById(productDTO.item.Id);
        return saveItem(productDTO.item);
    }

    public void removeItem(int productId){
        productRepository.deleteById(productId);
    }
}
