/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import static com.daw.programming.Challenge10_3.createTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alumnado
 */
public class UT10Test {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "INSERT INTO users (username, password) values (?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Pepe");
            ps.setString(2, "muydificil");
            int numRows = ps.executeUpdate();
            System.out.println(numRows + " row(s) inserted.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        /*
        String sql = "CREATE TABLE MARKS ("
                + "  username TEXT,"
                + "  module TEXT,"
                + "  mark INTEGER,"
                + "  PRIMARY KEY (username, module) "
                + ");";
        createTable(conn, sql);
        String sql2 = "CREATE TABLE users ("
                + "  username TEXT PRIMARY KEY,"
                + "  password TEXT"
                + ");";
        createTable(conn, sql2);*/
    }
}
