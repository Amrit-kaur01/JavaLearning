package streamAPI;

//Program to filter the even integers from integer list

import java.util.*;
import java.util.stream.*;
public class GetEven {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        List<Integer> evenList = list
                                    .stream()
                                    .filter(x -> x%2==0)
                                    .collect(Collectors.toList());

        System.out.println(evenList);
        
    }
}
