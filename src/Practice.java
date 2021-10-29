import java.util.*;

public class Practice {

    /*review
    //
    //Java's primary advantage: code only once and run anywhere with JVM
    //static: initialized only when the class executed => cannot instantiate
    //overriding: used by inherited class / overloading: has similar signature but different parameters
    //implements: interface / extends: superclass|subclass => cannot extend more than one class
    //define interface with abstract method
    //
    */

    public static void main(String[] args) {

        //Collection Interface
        //List:Collection
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        Stack st = new Stack();
        Queue qu = new LinkedList<>();

        int[] arr = {1, 2, 3};
        int idx = Arrays.binarySearch(arr, 2);
        //Arrays.sort(object, Comparator)
        //Comparator, Comparable(default: ascending order)

        //iterator

        //Set:Collection
        //Hash Set, Tree Set
        Set set = new HashSet(); //overwrite duplicate data. for the instance, we need a overridded equals(), hashCode()
        Set tset = new TreeSet(); //binary search tree

        //Map
        //Hash Map = updated version of HashSet
        HashMap map = new HashMap();
        map.put("key", "value");
        TreeMap tmap = new TreeMap(); //using binary search tree

        //Stream:Collection = supports various methods which be pipelined to produce the desired result
        al.stream().sorted().forEach(System.out::println);
    }

}

//Strategy Design Pattern
//make algorithm/behavior as a class and separate from the interface, so the inherited subClass can use the algorithm dynamically

//Observer Design Pattern
//help the object can be updated in a real time. we can make a thread using Runnable interface, and check the change of the state using PropertyChangeListener interface