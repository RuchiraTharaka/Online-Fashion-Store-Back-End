package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDTOForItemListRowMapper implements RowMapper<ProductDTOForItemList> {

    @Override
    public ProductDTOForItemList mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new ProductDTOForItemList(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("price"),
                resultSet.getString("images").split(",")[0]
        );
    }
}
