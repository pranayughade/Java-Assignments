//Q3. Write a java program to swap to first two digit & last two digit of a number.
//	Input : 12345
//	Output : 45312

class SwapTwo{
	public static void main(String[] x){
		int start = 12345;
		
		int og = start; int pos = 1;
		int end = og%100;
		while(start>=100){
			start = start/10;
			pos = pos*10;
		}
		int mid = og/100;
		
		
		System.out.println(end*pos +    (mid%10)*100  + start);
	}
}