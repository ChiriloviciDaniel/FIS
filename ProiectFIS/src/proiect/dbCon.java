/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author dani_
 */
public class dbCon {
   
    public static Connection ConnectionDB() {
        Connection conn;
 
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:D:\\project\\New Folder\\ProiectFIS\\src\\proiect\\FISacc.db");
            JOptionPane.showMessageDialog(null, "kkkkkkkk");
           return conn;
        } catch (ClassNotFoundException | SQLException e) {
       
            System.out.println(e+"con faild");
            return null;
        }
        
    }
}
