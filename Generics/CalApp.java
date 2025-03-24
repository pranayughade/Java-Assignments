class Calculator {
	
	
    public <T extends Number> double getSquare(T num){
        double res = num.doubleValue() * num.doubleValue();
        return res;
    }

}
class CalApp{
	
    public static void main(String[] x){
        Calculator c = new Calculator();
		double res = c.getSquare(5.6);
		System.out.println(res);
    }

}