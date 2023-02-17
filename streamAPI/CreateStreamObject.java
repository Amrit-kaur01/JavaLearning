package streamAPI;

import java.util.stream.*;

// Different ways to make a stream

public class CreateStreamObject {
    
    public static void main(String args[])
    {
        //Empty stream
        Stream<Object> emptyStream = Stream.empty();

        //Stream from an array
        String names[] = {"Aman", "Bob", "Cathy"};
        Stream<String> namesStream = Stream.of(names);
        namesStream.forEach(name -> System.out.println(name));

        
    }
}
