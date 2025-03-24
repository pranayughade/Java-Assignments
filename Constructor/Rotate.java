class Rotate{


	static int[]  rotate(int[] arr, int idx){
		rev(0, idx, arr);
		rev(idx+1, arr.length-1, arr);
		rev(0, arr.length-1, arr);
		
		return arr;
	}

	static void rev(int start, int end, int[] arr){
		
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
		}
	}
	
	public static void main(String[] x){
		int[] arr = rotate(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3);
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

