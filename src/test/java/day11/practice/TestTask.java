package day11.practice;

import day11.practice.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class TestTask {

	@Test

	public void Task() throws SQLException {
		Task t = new Task(4, "Drink", "Done");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");

		String query = "INSERT INTO task (id,name, status) VALUES (?, ?, ?)";
		PreparedStatement std = conn.prepareStatement(query);

		std.setInt(1, t.getId());
		std.setString(2, t.getName());
		std.setString(3, t.getStatus());

		int rows = std.executeUpdate();
		System.out.println("No of rows inserted :" + rows);
		std.close();
		conn.close();

	}

}