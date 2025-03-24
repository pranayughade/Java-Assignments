class GenConstructor{
	
	public <T> GenConstructor(T value){
		
		System.out.println("I am generic cinstructor with value " + value + ".");
		
	}
	
	public static void main(String[] x){
		GenConstructor b = new GenConstructor("Hi babe");
		
	}
}