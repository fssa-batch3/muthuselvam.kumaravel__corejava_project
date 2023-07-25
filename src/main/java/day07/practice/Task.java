package day07.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Task {
	private String name;
	private String deadline;

	public Task(String name, String deadline) {
		this.name = name;
		this.deadline = deadline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Task other = (Task) obj;
	    if (!name.equals(other.name) || !deadline.equals(other.deadline))
	        return false;
	    return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,deadline);
	}

	public static void main(String[] args) {
		
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