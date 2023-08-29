package com.example.demo;

import com.example.demo.exceptions.DataManipulatingFailureException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductServiceJDBCIMPL implements ProductService{
    private final JdbcTemplate jdbcTemplate;

    public ProductServiceJDBCIMPL(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<ProductDTOForItemList> getItemList(int categoryId) {
        var sql = """
                 SELECT product.id,
                        product.name,
                        product.price, 
                        TOP product_images.images AS image 
                 FROM product,product_images
                 WHERE  product.category=? 
                        AND product.id=product_images.product_id  
                 GROUP BY product.id;
                 """;
        return jdbcTemplate.query(sql, new ProductDTOForItemListRowMapper(), categoryId);
    }

    @Override
    public Product getProductDetails(int categoryId, String productId) {
        var sql = """
                 SELECT product.*,
                        GROUP_CONCAT(DISTINCT product_images.images) AS images, 
                        GROUP_CONCAT(DISTINCT product_sizes.sizes) AS sizes 
                 FROM product,product_images,product_sizes 
                 WHERE  product.id=? 
                        AND product.id=product_images.product_id 
                        AND product.id=product_sizes.product_id 
                 GROUP BY product.id;
                 """;
        return jdbcTemplate.queryForObject(sql, new ProductRowMapper(), Integer.parseInt(productId));
    }

    @Override
    @Transactional()
    public int getItemListLength(int categoryId) {
        var sql = """
                 SELECT COUNT(product.id) AS item_count
                 FROM product
                 WHERE  product.category=?  
                 """;
        return jdbcTemplate.queryForObject(sql, (resultSet, i) -> {
            return resultSet.getInt("item_count");
        },categoryId);
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRED)
    public synchronized int saveItem(Product product) {
        var sql = "INSERT INTO product(category,description,name,price) VALUES (" + product.Category + ",'" + product.Description + "','" + product.Name + "'," + product.Price + ");";
        jdbcTemplate.execute(sql);
        var sqlToGetId = """
                 SELECT LAST_INSERT_ID() as item_count; 
                 """;
        return jdbcTemplate.queryForObject(sqlToGetId, (resultSet, i) -> {
            int Id =  resultSet.getInt("item_count");
            product.Images.stream().forEach((image)->{
                var sqlForImages = "INSERT INTO product_images VALUES (" + Id + ",'" + image + "');";
                jdbcTemplate.execute(sqlForImages);
            });
            product.Sizes.stream().forEach((size)->{
                var sqlForSizes = "INSERT INTO product_sizes VALUES (" + Id + ",'" + size + "');";
                jdbcTemplate.execute(sqlForSizes);
            });
            return Id;
        });
}

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRED)
    public int updateItem(ProductDTOForUpdating productDTO) throws DataManipulatingFailureException {
        Product product = productDTO.item;
        var sqlForUpdating = "UPDATE product SET category=" + product.Category + ", description='"+ product.Description + "', name='"+ product.Name + "', price=" + product.Price + " WHERE id=" + productDTO.item.Id + ";";
        jdbcTemplate.update(sqlForUpdating);
        var sqlForDeleting = "DELETE FROM product_images WHERE product_id=" + productDTO.item.Id + ";";
        jdbcTemplate.execute(sqlForDeleting);
        sqlForDeleting = "DELETE FROM product_sizes WHERE product_id=" + productDTO.item.Id + ";";
        jdbcTemplate.execute(sqlForDeleting);
        product.Images.stream().forEach((image)->{
            var sqlForImages = "INSERT INTO product_images VALUES (" + productDTO.item.Id + ",'" + image + "');";
            jdbcTemplate.execute(sqlForImages);
        });
        product.Sizes.stream().forEach((size)->{
            var sqlForSizes = "INSERT INTO product_sizes VALUES (" + productDTO.item.Id + ",'" + size + "');";
            jdbcTemplate.execute(sqlForSizes);
        });
        return productDTO.item.Id;
    }

    @Override
    @Transactional
    public void removeItem(int productId) {
        var sqlForDeleting = "DELETE FROM product_images WHERE product_id=" + productId + ";";
        jdbcTemplate.execute(sqlForDeleting);
        sqlForDeleting = "DELETE FROM product_sizes WHERE product_id=" + productId + ";";
        jdbcTemplate.execute(sqlForDeleting);
        sqlForDeleting = "DELETE FROM product WHERE product_id=" + productId + ";";
        jdbcTemplate.execute(sqlForDeleting);
    }
}
