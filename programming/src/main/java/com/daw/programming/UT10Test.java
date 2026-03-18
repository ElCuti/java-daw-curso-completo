/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumnado
 */
public class UT10Test {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        String sql = "CREATE TABLE users ("
                + "  username TEXT PRIMARY KEY,"
                + "  password TEXT"
                + ");";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UT10Test.class.getName()).log(Level.SEVERE, null, ex);
        }
finally{
            conn.close();
        }
    }
}
