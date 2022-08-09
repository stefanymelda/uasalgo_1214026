import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Koneksi {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException {
        try {
            String DB ="jdbc:mysql://localhost/codealgo";
            String user="root";
            String pass="";
            MySQLConfig = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
         return MySQLConfig;
    }
    
}
}