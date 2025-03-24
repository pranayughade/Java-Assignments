//Q1. Write a java program to create class name ReverseApp using contsructor name as :
//
//	ReverseApp(int [ ])
//	{
//		//  perform integer reverse array logic.
//	}
//	
//	ReverseApp(String )
//	{
//		//  perform string reverse logic.
//	}

class ReverseApp{
	
	//----------------------------array reverse---------------------------------------
	ReverseApp(int[] arr){
		int start = 0;
		int end = arr.length-1;
		
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for(int a : arr){
			System.out.print(a + " ");
		}
	}
	
	//------------------------------String Reverse----------------------------------------
	ReverseApp(String str){
		String s = "";
		 
		for(int i = str.length()-1; i>=0; i--){
			s = s + str.charAt(i);
		}
		
		System.out.println(s);
		
	}
	
	public static void main(String[] x){
		ReverseApp obj = new ReverseApp(new int[]{1, 2, 4, 5});
		ReverseApp obj1 = new ReverseApp("HIBro");
	}
	
	
}

