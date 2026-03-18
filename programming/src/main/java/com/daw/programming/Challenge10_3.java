package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Challenge10_3 {

    public static void createTableMarks(Connection conn) {
        String sql = "CREATE TABLE MARKS ("
                + "  username TEXT PRIMARY KEY,"
                + "  module TEXT"
                + "  mark INT"
                + ");";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UT10Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

