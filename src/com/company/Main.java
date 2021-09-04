package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "INSERT INTO jdbctable (sname, salary ,company, date)" + "VALUES('hari','200','java','2012012')";
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

              /*  String sql2 ="UPDATE myusers SET email='ravitej@.com' WHERE id='2'";
                Statement statement2= connection.createStatement();
                int rows1=statement2.executeUpdate(sql2);

                String sql3="DELETE FROM myusers WHERE id='3'";
                Statement statement3= connection.createStatement();
                int rows2=statement3.executeUpdate(sql3);

*/

                String sql1 = "SELECT * FROM jdbctable";

            Statement statement1 = connection.createStatement();
            ResultSet result =statement1.executeQuery(sql1);

            while (result.next()) {
                String userId = result.getString("sname");
                String userName = result.getString("salary");
                String userEmail = result.getString("company");
                String userAddress = result.getString("date");
                System.out.println(userId + "," + userName + "," + userEmail + "," + userAddress);
            }

            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }}































