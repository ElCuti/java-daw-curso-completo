package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Challenge10_9 {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the desired user: ");
            String user = keyboard.nextLine();
            System.out.println("Enter the field you want to sort by: ");
            String campoOrdenacion = keyboard.nextLine();
            HashSet<String> wl = new HashSet();
            wl.add("username");
            wl.add("module");
            wl.add("mark");
            if (!wl.contains(campoOrdenacion)) {
                campoOrdenacion = "username";
            }
            String sql = "select * from marks where username =? order by '" + campoOrdenacion + "';";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString("username"));
                System.out.print(", ");
                System.out.print(rs.getString("module"));
                System.out.print(", ");
                System.out.println(rs.getString("mark"));
            }
            rs.close();
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
