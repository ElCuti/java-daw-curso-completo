/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daw.programming;


import static com.daw.programming.Challenge10_3.createTableMarks;
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
        createTableMarks(conn);

    }
}
