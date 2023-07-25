package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestTask {
@Test
	public void test() {
	List<Task> taskList = new ArrayList<>();

    
    taskList.add(new Task("Task 1", "2023-07-18"));
    taskList.add(new Task("Task 2", "2023-07-19"));
    taskList.add(new Task("Task 3", "2023-07-18"));
    taskList.add(new Task("Task 1", "2023-07-18"));
    taskList.add(new Task("Task 4", "2023-07-20"));
    taskList.add(new Task("Task 2", "2023-07-19"));

 
    Set<Task> taskSet = new HashSet<>(taskList);
    taskList.clear();
    taskList.addAll(taskSet);
    
    
    

  
    for (Task task : taskList) {
        System.out.println("Task: " + task.getName() + ", Deadline: " + task.getDeadline());
}
	}

}
