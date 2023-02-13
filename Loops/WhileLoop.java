//import java.util.Scanner;

//Program to understand the basics and syntax of while loop with example

/*
 * Syntax
    initialization;
    while(condition)
    {
        //body
        updation;
    }
 */
public class WhileLoop {
    public static void main(String args[])
    {
        int num=1; //initialization
        while(num<=10)
        {
            System.out.println(num);
            num++; //updation
        }
    }

    //This method returs the no of occureence of a digit in a given num 
    int countNoOfOccurrence(int num,int findNum)
    {
        int count=0;
        while(num>0)
        {
            int remainder=num%10;
            if(remainder==findNum)
                count++;
            num/=10;

        }
        return count;
    }
}

/*
 * Use while loop when you don't know how many times the loop will run
 */