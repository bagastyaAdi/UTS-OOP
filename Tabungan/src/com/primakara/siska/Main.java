package com.primakara.siska;

import java.sql.*;
public class Main {
    public static void main(String[] args) {
        //Langkah 1 : Test Koneksi

        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/siska";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi ke database Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi ke database Gagal: " + e.getMessage());
        }
    }
}
