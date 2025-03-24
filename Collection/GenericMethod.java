import java.util.List;

public class GenericMethod {
    public <T> void displayArr(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
        
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.displayArr(List.of("Ram","Shyam","Raj"));
    }
}
