package revisi;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
   private static Connection con;
   public static Connection getConnection(){
       try{
           con = DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/revisi","root","");
           //JOptionPane.showMessageDialog(null, "koneksi berhasil");
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Koneksi Gagal"+e.getMessage());
       }
       return con;
   }
}