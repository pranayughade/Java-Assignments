public class Box {
    Object id;
    Object name;

    Box(Object a, Object b){
        this.id = a;
        this.name = b;
    }
}
class Main{
    public static void main(String[] x){
        Box b = new Box(1, "Hello");
        System.out.println(b.id + " " + b.name);

        //to check the type of object
        String res1 =(b.name).getClass().getName();
        String res2 =(b.id).getClass().getName();
        System.out.println(res1);
        System.out.println(res2);
    }
}
