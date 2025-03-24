
//Q4. WAP to create class name as ConvertDecimalToBinary 
//onvertDecimalToBinary(int): this constructor is used for accept integer as parameter 
//Vodi showBinary(): this function can convert decimal number to binary and display it.
class DecimalToBinary{
	int dec;
	
	DecimalToBinary(int num){ dec = num; }
	
	void display(){
		int b = 0; int pos =1; int n = dec;
		while(n!=0){
			int rem = n%2;            //10%2= 0, 10/2=5        5%2=1, 5/2 = 2   2%2=0, 2/2=1   1%2= 1, 1/2 = 0
			b = b + rem*pos;
			pos = pos*10;
			n = n/2;
		}
		
		System.out.println("Decimal num " + dec + " in binary is " + b);
	}
}