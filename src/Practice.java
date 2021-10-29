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

        //Set:Collection
        //Hash Set, Tree Set

        //Map
        //Hash Map
    }

}
