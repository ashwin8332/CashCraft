package com.mycompany.bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USERNAME = "root";  // MySQL username
    private static final String PASSWORD = "8329789841";  // MySQL password

    // Method to create a connection to the database
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create and return a connection to the database
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
