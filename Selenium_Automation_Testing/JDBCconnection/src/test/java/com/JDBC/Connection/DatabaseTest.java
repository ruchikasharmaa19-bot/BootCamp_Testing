package com.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DatabaseTest {

    private Connection connection;

    @Test
    public void establishDatabaseConnection() throws ClassNotFoundException, SQLException {

        // Database connection details
        String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String user = "root";
        String password = "ruchi";

        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Connecting to Database...");

        // Establish the database connection
        connection = DriverManager.getConnection(databaseURL, user, password);

        // Check if the connection is successful
        if (connection != null) {
            System.out.println("Database Connection Successful");
        } else {
            System.out.println("Database Connection Failed");
        }

        // Close the connection
        connection.close();
    }
}