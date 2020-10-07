package net.javaguides.register.database;
import net.javaguides.register.bean.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import net.javaguides.register.bean.*;
public class EmployeeDao {

    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String SQL = "INSERT INTO employee" +
            "  (Username, Email, Password, Confirm__Password) VALUES " +
            " (?,?,?,?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/javabase";
		String username = "newuser";
		String password = "password";
		
		System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password);
        	

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            /*preparedStatement.setInt(1, 1);
            System.out.println("id");*/
            preparedStatement.setString(1, employee.getUsername());
            System.out.println(employee.getUsername());
            preparedStatement.setString(2, employee.getEmail());
            System.out.println(employee.getEmail());
            preparedStatement.setString(3, employee.getPassword());
            System.out.println(employee.getPassword());
            preparedStatement.setString(4, employee.getConfirm__Password());
            System.out.println(employee.getConfirm__Password());
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
            System.out.println("DB COnnected");
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
