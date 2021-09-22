package com.sic;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datos", "usuariotabla", "pass1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from alumnos");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(4));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
