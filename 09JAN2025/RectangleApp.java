//1. Create a Rectangle class
//Create a Rectangle class with length and breadth as instance variables.
//Write a default constructor that assigns both values to 5.
//Add a method area() to calculate and display the area of the rectangle.
//Explanation: This practice teaches how to initialize instance variables using the default constructor and perform a //calculation.


class Rectangle{
	private float length;
	private float breadth;
	
	Rectangle(){
		this.length = 5;
		this.breadth = 6;
	}
	
	void area(){
		float area = this.length*this.breadth;
		System.out.println(area);
	}
}
class RectangleApp{
	public static void main(String[] x){
		Rectangle r = new Rectangle();
		r.area();
	}
}