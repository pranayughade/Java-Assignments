//3. Create a BankAccount class
//Create a BankAccount class with fields accountNumber and balance.
//The default constructor should assign a fixed account number and balance.
//Add a method deposit() that increases the balance by a fixed amount, e.g., 100.
//Explanation: This teaches object initialization and the concept of modifying instance variables through methods.


class BankAccount{
	private long accNum;
	private long balance;
	
	BankAccount(){
		this.accNum = 337232087;
		this.balance = 335000;
	}
	
	void deposit(){
		long dep = 100000;
		this.balance = balance+dep;
		
		System.out.println("Succesfully deposited " + dep + " INR in " + accNum + " account number.\nYour current balance is " + this.balance + " INR.");
	}
}

class BankAccountApp{
	public static void main(String[] x){
		BankAccount b = new BankAccount();
		b.deposit();
	}
}
