/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbaticketsales;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dewberry
 */
public class db {
    Connection conn = null;
    
    public static Connection java_db(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + "src/sql/myDatabase.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("WRONG PATH");
            return null;
        }
    }
}
