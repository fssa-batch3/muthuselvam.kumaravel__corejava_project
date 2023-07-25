package day06.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestTask {
	@Test
	
public void task() {
		
	ArrayList<addTask> taskList = new ArrayList<>();

	taskList.add(new addTask(1, "Finish report", "Complete the quarterly sales report."));
	taskList.add(new addTask(2, "Buy groceries", "Purchase items for the week."));
	taskList.add(new addTask(3, "Study for exam", "Prepare for the upcoming Java exam."));
	taskList.add(new addTask(4, "vanitha", "Prepare for the upcoming Java exam."));

	for (addTask task : taskList) {
		System.out.println(task);
	}
		 
		 
		
	}

}