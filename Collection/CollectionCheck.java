import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//to implment all the method  of the collection framework make sure to write two different list of names of the persons and then perform the following operations on them using the
//usinng the colection methods

public class CollectionCheck {
    public static void main(String[] args) {
        Collection<String> list1 = new ArrayList<>();
        list1.add("Ram");
        list1.add("Shyam");
        list1.add("Raj");
        list1.add("CHandu");
        list1.add("Aman");

        Collection<String> list2 = new ArrayList<>();
        list2.add("Nayan");
        list2.add("Shyam");
        list2.add("Sandesh");
        list2.add("raman");

//        containsAll — returns true if the target Collection contains all of the elements in the specified Collection.
//        addAll — adds all of the elements in the specified Collection to the target Collection.
//        removeAll — removes from the target Collection all of its elements that are also contained in the specified Collection.
//        retainAll — removes from the target Collection all its elements that are not also contained in the specified Collection. That is, it retains only those elements in the target Collection that are also contained in the specified Collection.
//        clear — removes all elements from the Collection.

        //checks if the list2 contains all the elements of list1
        System.out.println(list2.containsAll(list1));

        //adds all the element from another collection
        list2.addAll(list1);
        System.out.println(list2);

        //clear all the elements from the list
        list2.clear();
        System.out.println(list2);

        //adding from one colection to another
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);



        //retainall method will remove all the elements from the list2 which are not present in list1

        list2.add("Sachin");
        list2.removeAll(list1);
        System.out.println(list2);


//        -----------------------------------------------------------------

//        array operation using collection
        String[] arr = list1.toArray(new String[3]);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));



    }
}
