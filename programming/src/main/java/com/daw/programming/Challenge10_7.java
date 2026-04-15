package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Challenge10_7 {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "update MARKS set mark =? where module=? and username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(3, "Daniel");
            ps.setString(2, "Programación");
            ps.setString(1, "3");

            int numRows = ps.executeUpdate();
            System.out.println(numRows + " row(s) modified.");
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
