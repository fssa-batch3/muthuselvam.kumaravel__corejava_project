package day01.practice;

public class practice01 {
    private String color;
    private String age;
    private String speak;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getage() {
        return age;
    }
    public void setage(String age) {
        this.age = age;
    }
    public void speak() {
        System.out.println("Meow!");
    }
    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        practice01 cat1 = new practice01();
        cat1.setColor("White");
        cat1.setage("4");
        practice01 cat2 = new practice01();
        cat2.setColor("Black");
        cat2.setage("3");
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getage());
        System.out.println("Color: " + cat1.getColor());
        System.out.print("Speaks: " ); cat1.speak();
        System.out.println("Cat 2:");
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Age: " + cat2.getage());
        System.out.print("Speaks: " ); cat2.speak();
    }
}