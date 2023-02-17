package exceptionHandling;

/*
 * exception handling handles the runtime errors so that the normal flow of the application can be maintained
 * exception disrupts the normal flow of the program
 * it is an object which is thrown at runtime
*/

/*
 * Syntax:
        try{
            //code that may raise exception
        }
        catch(Exception_class_name ref)
        {
            
        }
 */

public class Basics {
    public static void main(String[] args) {
        try{
            

            int div =100/0;   //an object of exception class will be thrown

            System.out.println("Hey");  //this line will not be executed because exception will occur above
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            
        }
        
        //Rest of the code
        System.out.println("Rest of the program");
    }
}

//If an exeption occurs in catch block it will not be handled