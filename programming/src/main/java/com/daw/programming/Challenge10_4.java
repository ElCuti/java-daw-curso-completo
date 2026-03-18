package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Challenge10_4 {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "INSERT INTO MARKS (username, module, mark) values (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Daniel");
            ps.setString(2, "Programación");
            ps.setString(3, "10");
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
    }

}
