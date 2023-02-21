package Packages;

/*
 * There are three ways to access the package from another package:
 * 1. import package.*
 * 2. import package.className
 * 3. fully qualified name
 */

import Methods.*;  //imporitng package using package.*

// import Methods.Basics;  //second method: using this statement only Basics class will be accessible in this program
public class AccessPackage {
    public static void main(String args[])
    {
        //Basics object = new Basics();
        System.out.println(Basics.greet("Arun"));

        /* Using fully-qualified name to access the basics class (third method). Generally used when two packages have same class name
           
            Methods.Basics object=new Methods.Basics();
            System.out.println(object.greet("Arun"));
         */
    }
}
