//what is vector class in java?
//Vector class in Java is a part of the Java Collection Framework and is present in the java.util package. It is similar to ArrayList, but with two differences:
//Vector is synchronized.
//Vector contains many legacy methods that are not part of the collections framework.

//what are the methods in vector that are inherited?
//Vector class inherits methods from the following classes:
//Object class
//AbstractCollection class
//AbstractList class
//List interface
//Cloneable interface
//Serializable interface
//and?
//Vector class implements the following interfaces:
//List interface
//RandomAccess interface
//Cloneable interface
//Serializable interface

import java.util.Vector;

public class VectorClass {
    Vector<Integer> v;

    void setVector(Vector v){
        this.v = v;
    }

    void display(){
        for(int i = 0; i<v.size(); i++){

        }
    }

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(3);
        v.add(5);
        System.out.println(v);


//        System.out.println(v);
        //updated the value at index 0
        v.set(0, 8);

        //remove the element at index 1
        int removed = v.remove(1); //list inteface wali mehtod

        //how to use the remove mehtod of collection inteface?


        v.remove(Integer.valueOf(3));

        System.out.println(v);





    }
}
