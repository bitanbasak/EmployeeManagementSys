
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bitan Basak
 */
public class connect {
    public static Connection connect_db() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Bitan Basak\\Documents\\NetBeansProjects\\Employee Management System\\src\\employee_management_system.sqlite");
            //JOptionPane.showMessageDialog(null, "Connected Successfully");
            return con;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
