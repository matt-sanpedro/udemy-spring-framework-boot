package com.example.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*
		 * A first JDBC application to demonstrate below concepts:
		 * 1. import package -> import java.sql.*;
		 * 2. load and register -> loaded in application.properties file
		 * 3. create connection
		 * 4. create statement
		 * 5. execute statement
		 * 6. process the results
		 * 7. close
		 */

		// //  3. create connection
		// try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:5432/demo", "root", "root")) {

		// 	// 4. create statement
		// 	Statement statement = connection.createStatement();

		// 	// 5. execute statement
		// 	ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

		// 	// 6. process the results
		// 	while (resultSet.next()) {
		// 		System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
		// 	}

		// 	// 7. close
		// 	resultSet.close();
		// 	statement.close();

		// } catch (SQLException e) {
		// 	e.printStackTrace();
		// }

		// 3. create connection [connection is an interface, not a class]
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
