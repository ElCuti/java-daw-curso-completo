/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteHelper {

    private String url;

    public SQLiteHelper(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        String driver = "org.sqlite.JDBC";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(getUrl());
            System.out.println("Connection established");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
