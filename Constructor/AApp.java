class A{
	A(){
		
		System.out.println("This is a default const");
		this(2);
	}
	A(int a){
		this(2, 3);
		System.out.println("Valuse of a = " + a);
	}
	A(int a, int b){
		System.out.println("values of a and b are: " + a + ", " + b);
	}
}
class AApp{

	public static void main(String[] x){
		A obj = new A();
	}
}