import java.util.Scanner;

//Program to understand the concepts and syntax of for loop with example


/* 
 * Syntax of for loop:
   
    for(initialization ; condition ; updation)
    {
        //body
    }
    
  
 */

// A for loop is used when the number of iterations are fixed

 /*
  * This program prints the first 5 multiples of a number given as input by the user
  * To print the multiples a for loop is used here
*/


public class ForLoop{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to print its first 5 multiples");
        int num=sc.nextInt();

        System.out.println("The first 5 multiples of "+num+" are as follows:");

        for(int i=1;i<=5;i++)
        {
            int multiple = num*i;
            System.out.print(multiple+", ");
        }
    }
}