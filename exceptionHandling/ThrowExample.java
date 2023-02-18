package exceptionHandling;

/*
 *throw keyword is used to throw an exception explicitly
 * we specify the exception object which is to be thrown
 * the exception can also have a message with it to provide the exception description
 * mainly used to throw a custom-exception 
 * allowed to thrown only one exception at a time. Cannot throw multiple exceptions
*/

public class ThrowExample {

    public static void speedLimit(int speed) throws ArithmeticException
    {
        if(speed>100)
        {
            throw new ArithmeticException("Overspeeding");
        }
        else
            System.out.println("Good to go");
    }

    public static void main(String[] args) {
        try{
            speedLimit(101);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        

        System.out.println("Rest of the code");
    }
}
