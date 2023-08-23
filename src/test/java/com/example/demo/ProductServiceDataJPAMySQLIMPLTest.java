package com.example.demo;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceDataJPAMySQLIMPLTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url= "jdbc:mysql://localhost:3306/newdatabase"; // table details
        String username = "ruchira"; // MySQL credentials
        String password = "ruchira123";
        String query= "select *from product"; // query to be run
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query); // Execute query
        rs.next();
        String name = rs.getString("Name"); // Retrieve name from db
        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");

    }

}