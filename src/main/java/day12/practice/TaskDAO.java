package day12.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day06.practice.*;
import day11.solved.ReusableTestConnection;

public class TaskDAO {

	public void createTask(TaskList task) throws DAOException {
		try (Connection connection = ReusableTestConnection.getConnection();
				PreparedStatement stmt = connection
						.prepareStatement("INSERT INTO tasklist (id,name, priority) VALUES ( ?, ?, ?)")) { // This is the
																									// try-with-resources

			// Hint: Set the values for the PreparedStatement using task properties
			stmt.setInt(1, task.getId());
			stmt.setString(2, task.getName());
			stmt.setInt(3, task.getPriority());

			// Hint: Execute the update statement
			int rows = stmt.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
			
		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
	}

	public void updateTask(TaskList task) throws DAOException {
		try (Connection connection = ReusableTestConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement("UPDATE tasklist SET priority=? WHERE id=?")) {

			// Hint: Add the SQL update statement here

			// Hint: Set the values for the PreparedStatement using task properties
			stmt.setInt(1, task.getPriority());
			stmt.setInt(2, task.getId());
			
			// Hint: Execute the update statement
			int rows = stmt.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
			
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
	}

	public void deleteTask(int taskId) throws DAOException {

		try (Connection connection = ReusableTestConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement("DELETE from tasklist WHERE id=?")) {

			stmt.setInt(1, taskId);

			// Hint: Execute the update statement
			int rows = stmt.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
			

		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
		// Hint: Add the try-with-resources for delete query here

		// Hint: Set the value for the PreparedStatement using the taskId

		// Hint: Execute the delete statement

		// Hint: Catch the SQLException and throw DAOException with appropriate message
	}

	public List<TaskList> getAllTask() throws DAOException {
		List<TaskList> task = new ArrayList<>();

		try (Connection connection = ReusableTestConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT id, name, priority FROM tasklist");
				ResultSet rs = stmt.executeQuery()) {

			// Hint: Iterate over the ResultSet to create Task objects and add them to the
			// tasks list
			while (rs.next()) {
				String name = rs.getString("name");
				int prio = rs.getInt("priority");
				int id = rs.getInt("id");

				System.out.println("TaskName:" + name + ", ID:" + id + ", prio:" + prio);
			}

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return task;
	}
	public static void main(String[] args) {
		TaskDAO taskDAO = new TaskDAO();

		TaskList task1 = new TaskList( "Attended meeting", 3,11);
		TaskList task2 = new TaskList( "Do Task Allocating", 4,12);
		

		try {

		//	taskDAO.createTask(task1);
		//	taskDAO.createTask(task2);

			task1.setPriority(10);
			taskDAO.updateTask(task1);

			int taskIdToDelete = 3;
			taskDAO.deleteTask(taskIdToDelete);

			List<TaskList> tasks = taskDAO.getAllTask();

			for (TaskList task : tasks) {
				System.out.println(task);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}
}