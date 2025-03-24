public interface Product <T>{

    public T[] get();
    public void set(T[] t);
    public void print();

    default void printDefault(){
        System.out.println("Default method");
    }
}
