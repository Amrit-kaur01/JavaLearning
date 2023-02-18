package exceptionHandling;

/*
 *there can be multiple catch blocks followed by try block
 *each catch block must contain a different exception handler
 * at a time only one exception occurs and at a time only one catch block is executed
 * all catch blocks must be ordered from most specific to most general
*/
public class MultipleCatch {
    public static void main(String[] args) {
        
        try{    
            int a[]=new int[5];    
            a[5]=30/0;   
        }    
        catch(ArithmeticException e)  
        {  
        System.out.println("Arithmetic Exception occurred");  
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
        System.out.println("ArrayIndexOutOfBounds Exception occurred");  
        }    
        catch(Exception e)  
        {  
        System.out.println("Parent Exception occurred");  
        }          

        

    }
    
}

/*
 In above example, try block contains two exceptions. But a time only one exceptio  occurs and its 
 corresponding catch block is executed.
 In line 14, first of all 30/0 will be evaluated and it will give ArithmeticException. That is why it is always
 caught first, even though there is ArrayIndexOutOfBoundsException too.. If catch block for ArithmeticException
 will not be given, the catch block containing the parent Exception class will be invoked. 
*/

