package day12.practice;

import java.util.List;

import org.junit.jupiter.api.Test;

import day06.practice.TaskList;

public class TestTaskDao {

	@Test
	public void test() {
	
		
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


