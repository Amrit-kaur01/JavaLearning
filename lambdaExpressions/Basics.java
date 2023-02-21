package lambdaExpressions;

import java.util.*;
import java.util.function.Consumer;

/*
 * lambda expression is a short block of code which takes in parameters and returns a value
 * do not need a name   
 * expressions cannot contain variables, assignments, or statements such as if or for
 * usually passed as parameters to a function
 * provides implementation of functional interface
 * advantage - less coding
 * it is a function that can be created without belonging to any class
*/

/*
 * Syntax:
   	(argument-list) -> { body }
   	
   	* argument-list can be empty and non-empty as well
   	* arrow-token is used to link arguments-lists and body of expression
   	* body contains statements and expressions for lambda expression
 */

public class Basics {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//using lambda expression in the forEach() method to print the list
		list.forEach((n) -> System.out.print(n+" "));
		
		System.out.println();
		
		/*
		 * lambda expressions can be stored in variables if the variable's type is an interface which
		   has only one method 
		 * should have the same no. of parameters and same return type as that method
		 * One such example is Consumer interface used by lists
		*/
		
		Consumer<Integer> method = (n) -> { System.out.print(n+" ");}; 
		list.forEach(method);
	}
}
