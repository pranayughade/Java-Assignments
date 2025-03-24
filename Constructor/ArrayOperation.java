//Q3. Write a java program to create class name as ArrayOperation using contsructor overloading name as :
//
//	ArrayOperation(int [ ])
//	{
//		//  Sort Array Ascending and Descending Order.
//	}
//	
//	ArrayOperation(int a[ ] , int b[ ])
//	{
//		//  Merge Two Array and display it.
//	}
import java.util.*;
class ArrayOperation{
	ArrayOperation(int [ ] arr)
	{
		System.out.println("Given array: " + Arrays.toString(arr) + "\n");
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Array In Ascending order: " + Arrays.toString(arr) );
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length-i-1; j++){
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array In Ascending order: " + Arrays.toString(arr) );
	}
	
	
	ArrayOperation(int[] arr1, int[] arr2){
		System.out.println("Giver arrays are: " +  Arrays.toString(arr1)  + " &  " +  Arrays.toString(arr2) );
		int index = 0;
		int[] res = new int[arr1.length + arr2.length];
		
		for(int i= 0; i<arr1.length; i++){
			res[index++] = arr1[i];
			
		}
		for(int i = 0; i<arr2.length; i++){
			res[index++] = arr2[i];
		}
		System.out.println("Resultant array(merged): ");
		for(int i = 0; i<res.length; i++){
			System.out.print(res[i] + " ");
		}
	}
	
	
	public static void main(String[] x){
		ArrayOperation obj = new ArrayOperation(new int[]{1, 8, 6, 2, 9});
		ArrayOperation obj1 = new ArrayOperation(new int[]{1, 8, 6, 2, 9}, new int[]{0} );
		
		
	}
}
	
