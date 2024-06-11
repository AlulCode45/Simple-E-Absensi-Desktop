/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author my komputer
 */
public class DbConnection {

    private static Connection mysql;

    public static Connection connectDb() {
        try {
            String url = "jdbc:mysql://localhost:3306/absensi_siswa";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysql = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
        }

        return mysql;
    }
}
