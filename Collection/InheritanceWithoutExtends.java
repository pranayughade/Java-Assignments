import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Parent1{
    GenericMethod a;
    void show(){
        System.out.println(" Show method ofParent1");
    }
}


public class InheritanceWithoutExtends {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.a = new GenericMethod();
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);

        p.a.displayArr(list);
    }
}
