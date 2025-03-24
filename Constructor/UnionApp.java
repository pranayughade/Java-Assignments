//Q4. Write a java program to create class name as UnionApp using contsructor overloading name as :
import java.util.*;
class UnionApp{
	UnionApp(int [] arr)
	{
		//  Check array is Majority or Not.
		
		int votes = 0;
		int candidate = -1;
		
		for(int i = 0; i<arr.length; i++){
			if(votes == 0){
				candidate = arr[i];
			}else if(candidate == arr[i]){
				votes++;
			}else{ 
				votes--;
			}
		}
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			if(candidate == arr[i]){ count++; }
		}
		if(count>arr.length/2){
			System.out.println("majority ele is : " + candidate);
		}
		
	}
	
	UnionApp(int a[ ] , int b[ ])
	{
		int idx = 0;
		int[] res = new int[a.length + b.length];
		for(int i = 0; i<a.length; i++){
			res[idx] = a[i];
		}
		for(int i = 0; i<b.length; i++){
			res[idx] = b[i];
		}
		
		for(int i )
			
		
		
		
		int index = 0;
		for(int i = 0; i<a.length; i++){
			int ele = a[i];
			boolean flag = true;
			for(int j = 0; j<=index; j++){
				if(ele == res[j]){
					flag = false;
				}
			}
			if(flag){
				res[index++] = ele;
			}
		}
		for(int i = 0; i<b.length; i++){
			int ele = b[i];
			boolean flag = true;
			for(int j = 0; j<=index; j++){
				if(ele == res[j]){
					flag = false;
				}
			}
			if(flag){
				res[index++] = ele;
			}
		}
		
		System.out.println(Arrays.toString(res));
		
	}
	
	public static void main(String[] c){
		UnionApp a = new UnionApp(new int[]{1, 2, 1, 3, 1 ,1, 1});
		UnionApp a1 = new UnionApp(new int[]{1, 2, 1, 3, 1 ,1, 1}, new int[]{7});
	}
}
