//2. Create a Circle class
//Create a Circle class with a radius field.
//Use a default constructor to set the radius to 10.
//Add a method calculateCircumference() to calculate and display the circumference using the formula 2 * π * radius.
//Explanation: This question reinforces object-oriented principles and demonstrates mathematical operations with classes.


class Circle{
	private float radius;
	
	Circle(){
		this.radius = 10;
	}
	
	void calculateCircumference(){
		System.out.println("circumference of circle with rad. " + this.radius + " is " + 2*3.14*radius);
	}
}

class CircleApp{
	public static void main(String[] x){
		Circle c = new Circle();
		c.calculateCircumference();
	}
}