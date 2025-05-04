package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

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
			Statement st = con.createStatement();
			String query = "select * from student;";
			// String createQuery = "insert into student values (6, 'Merri', 91);";
			// String updateQuery = "update student set sname='Max' where sid=5;";
			// String deleteQuery = "delete from student where sid=5;";
			int sid = 102;
			String sname = "Jasmine";
			int marks = 87;

			// concatenation is not recommended in SQL queries
			/*
			 * concatenation is not recommended in SQL queries
			 * 1. it can lead to SQL injection attacks
			 * 2. tedious and can lead to syntax errors
			 * 3. use a prepared statement instead
			 * 4. prepared statement is more efficient due to caching
			 */
			// String insertQuery = "insert into student values (" + sid + ", '" + sname + "', " + marks + ");";
			String insertQuery = "insert into student values (?, ?, ?);";
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setInt(1, sid);
			ps.setString(2, sname);
			ps.setInt(3, marks);
			ps.execute();
			// // ResultSet is an interface, not a class
			// boolean status = st.execute((createQuery));
			// System.out.println("Data inserted: " + status);
			// st.execute((insertQuery));
			ResultSet rs = st.executeQuery(query);
			// System.out.println("Data available: " + rs.next());
			// must call the next method to move the cursor to the first row
			while (rs.next()) {
				System.out.println(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
			}
			con.close();
			System.out.println("Connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
