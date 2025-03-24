//Q2. Write a java program to create class name as OccurenceApp using contsructor name as :
//
//	OccurenceApp(int [ ])
//	{
//		//  count even and odd number in array.
//	}
//	
//	OccurenceApp(char [ ])
//	{
//		//  count vowel and consonent charcter in string.
//	}

import java.util.*;
class OccurenceApp{
	OccurenceApp(int[] arr){
		int oddCount = 0;
		int evenCount = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%2 == 0){
				evenCount++;
			}
			else{
				oddCount++;
			}
			
		}
		System.out.println("In array : " + Arrays.toString(arr) + "\n" + "Count of even number is: " + evenCount + "\n" + "Count of odd numbers is: " + oddCount + "\n");
	}
	
	OccurenceApp(String s){
		int v = 0;
		int c = 0;
		for(int i = 0; i<s.length(); i++){
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'  || s.charAt(i) == 'u'
					|| s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'  || s.charAt(i) == 'U' ){
					v++;
				}else if((s.charAt(i) >= 'A' && s.charAt(i)<='Z') || (s.charAt(i) >= 'a' && s.charAt(i)<='z')){
					c++;
				}
		}
		System.out.println("For string : " + s + "\n" + "Count of consonents is: " + c + "\n" + "Count of vowels is: " + v);
	}
	
	
	
	public static void main(String[] x){
		OccurenceApp obj1 = new OccurenceApp(new int[]{1, 2, 3, 4, 5, 6, 7 ,8});
		OccurenceApp obj2 = new OccurenceApp("Hello") ;
	}
	
}