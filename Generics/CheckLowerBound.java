class CheckLowerBound{

	public static void checkMe(List<? super Integer> list){
		
		//adding double nums into the list
		for(int i = 0; i<list.length(); i++){
			list.add(i*1.00);
		}
	}
}

class CheckLowerBoundApp{
	public static void main(String[] s){
		List<Number> li = new ArrayList<>();
		CheckLowerBound.checkMe(li);
	}
}