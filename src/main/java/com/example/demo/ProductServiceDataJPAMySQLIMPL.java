package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceDataJPAMySQLIMPL implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTOForItemList> getItemList(int categoryId){
        return productRepository.getItemList(categoryId).stream().map(item -> new ProductDTOForItemList(item.Id, item.Name,item.Price,item.Images.get(0))).toList();
    }

    public Product getProductDetails(int categoryId, String productId){
        return productRepository.findById(Integer.parseInt(productId)).get();
    }

    public int getItemListLength(int categoryId) {
        return productRepository.getItemList(categoryId).size();
    }
    public int saveItem(Product product){
        return productRepository.save(product).Id;
    }

    public int updateItem(ProductDTOForUpdating productDTO){
        productRepository.deleteById(productDTO.item.Id);
        return productRepository.save(productDTO.item).Id;
    }

    public void removeItem(int productId){
        productRepository.deleteById(productId);
    }
}
