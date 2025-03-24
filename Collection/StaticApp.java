public class StaticApp extends Parent{
    int a;
    void sayHi(){
        System.out.println("Hi");
    }

    static void display(){
        System.out.println("Static app Static method");
    }
    static int count = 0;


    //what is static class?
    //A class can be static only if it is a nested class.
    //A nested class is a class which is defined within another class.
    //A nested class can be declared as static or non-static.
    //A static nested class is a class which is declared as static.
    //It cannot access non-static data members and methods.
    //It can be accessed by outer class name.
    static class Child extends Parent{
        static void display(){
            if(count <= 1){
                count++;
                display();
//                why above display() mehtod not referring to the static display() mehtod in the outer class?
//                because the static method in the inner class is hiding the static method in the outer class.
//                this is called method hiding


                System.out.println("Child");
            }else{
                return;
            }

        }
        void printMe(){
            System.out.println("Print Me in child");
        }
    }

    public static void main(String[] args) {
      Parent obj = new Child();
//      obj.display();

      Child obj1 = new Child();
      obj1.display();

      StaticApp obj2 = new StaticApp();
      obj2.display();



    }
}