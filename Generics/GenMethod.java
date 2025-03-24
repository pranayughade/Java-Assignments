class GenMethod{
	public <T> void show(T value){
		System.out.println("I am generic method without making the class generic.");
		System.out.println("My value is " + value + ".\n");
	}
	
	<T extends Number> void showBound(T value){
		System.out.println("I am type bounded to numbers only.");
		System.out.println("My value is " + value + ".");
	}
	
	public static void main(String x[]){
		GenMethod obj = new GenMethod();
		obj.show(99.99999999999);
		obj.show(true);
		
		
		//obj.showBound("Hi");// will throw error
		obj.showBound(99.278229); 
		
	}
}

