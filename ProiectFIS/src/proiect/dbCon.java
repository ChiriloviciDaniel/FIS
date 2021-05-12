package proiect;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbCon {

    Connection con = null;

    public static Connection ConnectionDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:usersDb.db");
            
            return con;
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Connection failed" + e);
            return null;
        }

    }
}
