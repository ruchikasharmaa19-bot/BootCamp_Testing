package com.cordOperation;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValueInto {
    public static void main(String[] args) throws SQLException {

        String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String user = "root";
        String password = "ruchi";

        Connection con = DriverManager.getConnection(databaseURL, user, password);
        Statement stmt = con.createStatement();

        //String query = "INSERT INTO book_detl VALUES ('AI003','SeleniumAI','S','Aam','ABC','S','2026',500)";
String query2 = "DELETE FROM book_detl WHERE book_no= 'AI003'";
       // int result = stmt.executeUpdate(query);
        int result2 = stmt.executeUpdate(query2);
        
       // System.out.println(result + " Record Inserted Successfully");
        System.out.println(result2 + " Record Inserted Successfully");
        con.close();
    }
}