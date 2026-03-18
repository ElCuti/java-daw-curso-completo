/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteHelper {


    public static Connection getConnection() {
        String driver = "org.sqlite.JDBC";
        String url = "jdbc:sqlite:E:/MiBD/daw.db";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            System.out.println("Connection established");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
