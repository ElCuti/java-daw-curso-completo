/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;

import static com.daw.programming.Challenge10_3.createTableMarks;
import java.sql.Connection;

/**
 *
 * @author Alumnado
 */
public class UT10Test {

    public static void main(String[] args) {
        Connection conn = SQLiteHelper.getConnection();
        String sql = "CREATE TABLE MARKS ("
                + "  username TEXT,"
                + "  module TEXT,"
                + "  mark INTEGER,"
                + "  PRIMARY KEY (username, module) "
                + ");";
        createTableMarks(conn, sql);
        String sql2 = "CREATE TABLE users ("
                + "  username TEXT PRIMARY KEY,"
                + "  password TEXT"
                + ");";
        createTableMarks(conn, sql2);
    }
}
