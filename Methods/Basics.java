package Methods;
import java.util.*;

//Program to understand basic concepts of methods

/*
 * Methods is a collection of instructions that perform a specific task
 * It helps in code reusability
 */

 /*
     Syntax of a method:

        access_sprecifier return_type method_name (parameters list)
        {
            //body

            return statemnt
        }
  */


public class Basics{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String greetingMessage=greet(name);
        System.out.println(greetingMessage);
        sc.close();
    }

    //This method will return the string by adding Hey in the starting
    public static String greet(String name)
    {
        return "Hey"+name;
    }


    
}