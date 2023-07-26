package day06.practice;

/**
 * 
 */


import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Vinit Gore
 *
 **/
public class TaskList {
    private String name;
    private int priority;
    private int id;
   

	public  TaskList(String name, int priority,int id) {
    	this.name=name;
    	this.priority=priority;
    	this.id=id;
    	
    }
    
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub

}



}