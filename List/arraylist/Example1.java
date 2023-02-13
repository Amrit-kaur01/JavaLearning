package List.arraylist;
import java.util.*;
/*
 * arraylist uses a dynamic array to store elements
 * can have duplicates
 * extends the AbstarctList class which implements the list interface  
 * maintains the insertion order internally
 * it is non-synchronized
 * cannot create arraylist of primitive types. We need to use wrapper classes for them
 */
public class Example1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        String names[]={"Arun","ravi","John","Harry","Alice","Emma"};

        for(int i=0;i<names.length;i++)
            list.add(names[i]);  //adding objects in arraylist

        //Traversing the list through iterator
        Iterator itr= list.iterator();  //getting the iterator
        while(itr.hasNext()) //hasNext() returns true if there are more elements
        {
            System.out.println(itr.next());  // next() returns the next element
        }
        
        traversalMethod2(list);
        
    }

    //This method traverses the list using for-each loop
    static void traversalMethod2(List<String> list)
    {
        for(String str: list)
            System.out.println(str);
    }

    
}
