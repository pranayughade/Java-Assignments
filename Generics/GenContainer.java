
public class GenContainer<T> implements Container<T>{
	private T item;

	public T get(){
		return item;
	}
	public void add(T item){
		this.item = item;
	}
	
	
	
}