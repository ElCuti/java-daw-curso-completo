/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Alumnado
 */
public class Challenge10_5 {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        try {
            String sql = "select * from MARKS where username=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            Scanner keyboard1 = new Scanner(System.in);
            System.out.print("Que alumno quieres ver sus notas?: ");
            String completeName = keyboard1.nextLine();
            ps.setString(1, completeName);
            ResultSet rs = ps.executeQuery();

            if (rs.getString("username") == null) {
                System.out.println("No existe ningun usuario con ese nombre");
            } else {
                System.out.println("NOTAS DE " + rs.getString("username"));
                while (rs.next()) {
                    System.out.print(rs.getString("module"));
                    System.out.print(" = ");
                    System.out.println(rs.getString("mark"));

                }
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
