package List;

/*
 * asList() method of java.util.Arrays class, returns a fixed size list of the specified array
 * the returned list is serializable
 * the type of array passed must be a wrapper class. We cannot pass primitive data types
 * If you pass int a[], then it will return a List<int a[]> , and not List<Integer> because autoboxing
   doesn't happen in this case and int a[] is itself identified as an object and a list of int array
   is returned, instead of list of integers. Thus it will give error in various Collections functions 
 * it throws UnsupportedOperationException if we try to modify the list
*/
import java.util.*;
public class AsListMethod {
    public static void main(String[] args) {
        try{
            Integer  array[] = new Integer[]{1,2,3,4,5};

            //getting the list view of array
            List<Integer> list = Arrays.asList(array);
            System.out.println(list);
            
            list.remove(3);  //throws exception
        }
        catch(NullPointerException exception)
        {
            System.out.println(exception);
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println(e);
        }
    }
}
