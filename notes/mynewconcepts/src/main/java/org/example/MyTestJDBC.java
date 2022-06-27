package org.example;

import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.*;

public class MyTestJDBC {

    public static void main (String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Poloking19!");

        Statement st = conn.createStatement();
        ResultSet result = st.executeQuery("select * from employees");

        while(result.next()){
            System.out.println(result.getString("first_name")+" "+result.getString("salary"));
        }

    }

}