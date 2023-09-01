package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Product(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("category"),
                resultSet.getString("description"),
                resultSet.getInt("price"),
                new ArrayList<>(Arrays.asList(resultSet.getString("sizes").split(","))),
                new ArrayList<>(Arrays.asList(resultSet.getString("images").split(",")))
        );
    }
}
