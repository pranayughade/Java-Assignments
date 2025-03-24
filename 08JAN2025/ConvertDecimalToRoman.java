//Q3. WAP to create class name as ConvertDecimalToRoman 
//ConvertDecimalToRoman(int decimal): this constructor can accept decimal number 
//Void showRoman(): this function can convert a decimal number to roman and display it.
class DecimalToRoman{
	int num;
	
	DecimalToRoman(int num){
		this.num = num;
	}
	
	public void displayRoman(){
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int n = num;
		
		StringBuilder s = new StringBuilder("");
		for(int i = 0; i<values.length; i++){
			if(values[i]<n){
				s.append(symbols[i]);
				n = n - values[i];
			}
		}
		System.out.println(s);
		
	}
	
}