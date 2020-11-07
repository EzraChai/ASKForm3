package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String Nama = "Chai Juan Zhe";
        String kelas = "3Baiduri";
        int tempoh_masa_tidur = 8;

        try {
            String url = "jdbc:mysql://localhost:3306/bjpowernode?useTimezone=true&serverTimezone=UTC ";
            String username = "root";
            String password = "D9806f2a2b";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
            System.out.println(conn);
            stmt = conn.createStatement();
            String sql = "insert into masatidur(nama,kelas,tempoh_masa_tidur) values ("+Nama+","+kelas+","+tempoh_masa_tidur+" )";
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1? "Updated":"Error occurred");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
