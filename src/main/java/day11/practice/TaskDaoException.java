package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDaoException {

	public void createTask(Task task) throws DAOException, SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");
		System.out.println(connection);

		String query = "INSERT INTO tasklist (id, taskname, taskstatus) VALUES (?, ?, ?)";
		PreparedStatement stmt = connection.prepareStatement(query);

		
		stmt.setInt(1, task.getId());
		stmt.setString(2, task.getName());
		stmt.setString(3, task.getStatus());

	
		int rows = stmt.executeUpdate();
		System.out.println("Rows Added: " + rows);

		
		stmt.close();
		connection.close();
	}

}