package day04.practice;

public class Rectangle {
	private int length;
	private int breadth;
	
	

	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	public void Rectangle(int length ,int breadth) {
		System.out.println(length*breadth);
	}
	
	
	


}

class Square extends Rectangle{
	
	private void Square(int length) {
		System.out.println(getLength()*getLength());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		square.setLength(10);
		square.Square(10);
		square.setBreadth(5);
		rectangle.Rectangle(10,5);
	}

	
}
