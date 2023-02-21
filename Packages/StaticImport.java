package Packages;

//program to demonstrate static import

/*
 * Static import is a feature that allows members defined in class as public static to be used in java 
  code without specifying the class name in which the field is defined
 */

import static java.lang.System.*;
public class StaticImport {
    public static void main(String args[])
    {
        out.println("Hello"); //we don't need to use System.out here as it has been impored using static
    } 
}
