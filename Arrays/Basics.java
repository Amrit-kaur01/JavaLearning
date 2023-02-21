package Arrays;

import java.util.*;

/*
 * collection of similar types of objects
 * array objects are in heap
 * heap objects are not continuous 
 * hence array objects may not be continuous. It depends on JVM.
 */

public class Basics {
    public static void main(String[] args) {
        int array[]; //declaration - happens at compile time
        array= new int[5]; // initialization - happens at run time. Creating the object in heap memory

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<array.length;i++)
            array[i]=sc.nextInt();

        System.out.println(Arrays.toString(array));
    }
}
