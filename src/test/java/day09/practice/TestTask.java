package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTask implements Comparable<Task> {
    private int id;
    private String name;
    private LocalDate deadline;

    private int priority;
    
    public TestTask() {
    	
    }

    public TestTask(int id , String name ,LocalDate dead , int prior ){

        this.id = id ;
        this.name = name;
        this.deadline = dead;
        this.priority = prior;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                '}';
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public LocalDate getDeadline(){

        return this.deadline;
    }

    public int getPriority() {
        return this.priority;
    }

    public static void printTasks(List<Task> a){
        for(int i = 0 ; i< a.size() ; i++){
            System.out.println((a.get(i)).toString());


        }


    }
    @Override
    public int compareTo(Task o) {

        int i = this.deadline.compareTo(o.deadline);
        return i;
    }

    public static void main(String[] args){
        Task tsk1 = new Task(1,"Task1",LocalDate.of(2023,7,26),5);
        Task tsk2 = new Task(2,"Task2",LocalDate.of(2023,7,25),2);
        Task tsk3 = new Task(3,"Task3",LocalDate.of(2023,7,26),6);
        Task tsk4 = new Task(4,"Task4",LocalDate.of(2023,7,20),8);
        Task tsk5 = new Task(5,"Task5",LocalDate.of(2023,7,29),9);
        Task tsk6 = new Task(7,"Task6",LocalDate.of(2023,7,27),1);
        Task tsk7 = new Task(6,"Task7",LocalDate.of(2023,7,26),3);// creating objs

        List <Task> tasks = new ArrayList<Task>();
        tasks.add(tsk1);
        tasks.add(tsk2);
        tasks.add(tsk3);
        tasks.add(tsk4);
        tasks.add(tsk5);
        tasks.add(tsk6);
        tasks.add(tsk7); // adding task to list

        printTasks(tasks); // printing each obj

        System.out.println("--------------------------------------------");
        Collections.sort(tasks);
        printTasks(tasks);











    }


}