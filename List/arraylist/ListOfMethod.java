package List.arraylist;

/*
 * List.of() method returns an immutable list containing an arbitrary number of elements
 * hence we cannot modify the list once it is created
*/
import java.util.*;
public class ListOfMethod {
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,2,3,4,5,6);

        System.out.println(list);

        //list.add(8);   <- this will give an UnsupportedOperationException 
        
    }
}
