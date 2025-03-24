//Q2. WAP to create class Palim with parameterized constructor 
//   Palim(int): this constructor can accept number as parameter 
//   Boolean isPalim(): this method can check number is palimdrome or not if palimdrome return true otherwise return false


class Palin{
	int num;
	
	Palin(int num){ this.num = num; }
	
	
	boolean isPalin(){
		int n = num;
		int rem; int rev = 0;
		while(n!=0){
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		return rev == num;
		
		
	}
}

class PalindromeApp{
	public static void main(String ar[]){
		Palin p = new Palin(9921);
		boolean res = p.isPalin();
		System.out.println("Is number " + p.num + " palindrome? : " + res);
	}
}