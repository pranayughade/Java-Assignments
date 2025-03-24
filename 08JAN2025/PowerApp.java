//Q1. WAP to create class name as Power with Parameterized constructor 
//
// Power(int,int): create constructor and accept two parameters in it.
//  Int getPower(): this function can calculate power of a number and return it.

class Power{
	private int base;
	private int pow;
	
	Power(int n, int pow){
		this.base = n;
		this.pow = pow;
	}
	
	int getPower(){
	int res = 1;
		while(pow>=1){
			res = res*base; 
			pow--;
		}
		return res;
	}
}

public class PowerApp{
	public static void main(String[] x){
		Power p = new Power(5, 3);
		int res = p.getPower();
		System.out.println(res);
	}
}