package org.example.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/db_perpus";
    private static final String USER = "root";
    private static final String PASSWORD = "Feri1234567";
    private static Connection connection = null;

    public Connection getkoneksi(){
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Koneksi gagal!");
            }
        }
        return connection;
    }
}
