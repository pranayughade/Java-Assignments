public class Child extends Parent{
//    static void display(){
//        System.out.println("Child");
//    }

    @Override
    void printMe(){
        System.out.println("Print Me in child");
    }
    public static void main(String[] args) {
        // what is runtime polymorphism?
        // when a parent reference is used to refer to a child object
        // then the method that is called is decided at runtime\
        // this is called runtime polymorphism
        // this is also called dynamic method dispatch
        // this is also called method overriding
        // this is also called late binding
        // this is also called dynamic binding
        // this is also called virtual method invocation

        Parent obj1 = new Parent();
        obj1.printMe();

        obj1 = new Child();
        obj1.printMe();




    }
}
