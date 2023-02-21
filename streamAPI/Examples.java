package streamAPI;

import java.util.stream.*;
import java.util.*;

public class Examples{
    public static void main(String[] args) {
        
        //Integer stream
        IntStream.range(1,10).forEach(System.out::print);   //creating an integer stream and printing each integer
        System.out.println();

        //Integer stream with skip
        IntStream
            .range(1,10)    //gives the stream of integers from 1 to 9
            .skip(5)        //skips the first 5 elements of our stream i.e from 1 to 5
            .forEach(x -> System.out.println(x));     //prints the integer using lambda expression
        System.out.println();
        
        //Integer stream with sum
        System.out.println(
            IntStream.range(1,5)
                .sum()   //this will return the sum from 1 to 4 and return the result to println() method which will print it
        );
        
        //Stream.of() with sorted
        Stream.of("Bob","Allen","Cathy")  //making a stream of strings
            .sorted()    //sorts the stream elements. We can also pass an comparator in this
            .findFirst()   //gives the first element of stream
            .ifPresent(System.out::println); //prints the element if present. If the optional object is empty then this method doesn't gets executed

        //Stream from array, sort, filter
        String[] names = {"Allen","Priya","Pari","Aastha","Elena","Caroline","Bonnie","Parker","Parag"};
        Arrays.stream(names)   //same as Stream.of(names)
            .filter(x -> x.startsWith("P"))  //filter those strings which start with P
            .sorted()
            .forEach(System.out::println);

        //Average of squares of an int array
        Arrays.stream(new int[]{1,2,3,4,5,6})
            .map(x -> x*x)    //squaring each integer
            .average()  //taking average of all the elements
            .ifPresent(System.out::println);

        //stream from list, filter and print
        List<String> listNames = Arrays.asList(names);
        listNames.stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);
        

        //stream from array of strings, store fields in hashmap
        String[] students = {"101,Stu1", "102, Stu2", "103, Stu3", "104, Stu4"};
        Stream<String> studentsStream = Arrays.stream(students);
        Map<Integer,String> map = new HashMap<>();
        map = studentsStream
                .map(x -> x.split(","))
                .collect(Collectors.toMap(
                    x -> Integer.parseInt(x[0]),
                    x -> x[1]
                ));

        for(Integer rno: map.keySet())
        {
            System.out.println(rno+":"+map.get(rno));
        }


        //Reduction-summary statistics. works only with integers
        IntSummaryStatistics summary = IntStream.of(3,6,9,13,23,9)
            .summaryStatistics();
        System.out.println(summary);

    }
}