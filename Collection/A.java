public class A {
    static int a;
    int instanceVar;

//    why do we use static block?
//    static block is used to initialize the static variables of the class.
//    static block is executed before the main method at the time of class loading.
//    static block is executed only once.
//    static block is used to write the logic that should be executed only once.


    static{
        a= 4;
        System.out.println("Static block");
    }



//    why do we use instance block?
//    Instance block is used to initialize the instance variables of the class.
//    Instance block is executed every time an object is created.
//    Instance block is executed before the constructor.
{
    this.a = 5;
    System.out.println("Instance block");
}

    public static void main(String[] args) {
//        System.out.println("Main method");
        A obj1 = new A();
        System.out.println(obj1.a);


    }
}
