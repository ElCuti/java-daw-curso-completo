package com.daw.programming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Challenge10_6 {

    public static void main(String[] args) throws SQLException {
        /*
        Codigo con falla de inserccion SQL
        
        Scanner keyboard = new Scanner(System.in);
    System.out.println("Introduzca el usuario deseado: ");
    String user = keyboard.nextLine();
    String sql = "select * from marks where username = '"+user+"';";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {
        System.out.print(rs.getString("username"));
        System.out.print(", ");
        System.out.print(rs.getString("module"));
        System.out.print(", ");
        System.out.println(rs.getString("mark"));
    }
    rs.close();

         */

        //Codigo arreglado:
        Connection conn = SQLiteHelper.getConnection();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca el usuario deseado: ");
        String user = keyboard.nextLine();
        String sql = "select * from marks where username =?;";
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
    }
}
