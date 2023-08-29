package com.example.demo.itemlist;

import com.example.demo.*;
import com.example.demo.exceptions.DataManipulatingFailureException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ItemListController {

    @Autowired
    private ProductServiceDataJPAMySQLIMPL productService;

    @RequestMapping("/itemlist/{categoryId}")
    public List<ProductDTOForItemList> getItemList(@PathVariable int categoryId) {
        return productService.getItemList(categoryId);
    }

    @RequestMapping(path = "/itemlist/{categoryId}/{productId}")
    public Product getProductDetails(@PathVariable int categoryId, @PathVariable String productId) {
        return productService.getProductDetails(categoryId, productId);
    }

    @RequestMapping("/itemlist/length/{categoryId}")
    public int getItemListLength(@PathVariable int categoryId) {
        return productService.getItemListLength(categoryId);
    }

    @PostMapping("/itemlist")
    public int saveItem(@RequestBody Product product){
        return productService.saveItem(product);
    }

    @PutMapping("/itemlist")
    public int updateItem(@RequestBody ProductDTOForUpdating productDTO, HttpServletResponse response) {
        response.addHeader("val", "Vallllllll");
        try {
            return productService.updateItem(productDTO);
        }catch (Exception e){
            return -1;
        }
    }

    @DeleteMapping("/itemlist/{productId}")
    public int removeItem(@PathVariable int productId){
        productService.removeItem(productId);
        return 5;
    }

}
