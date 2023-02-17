package exceptionHandling;

/*
 * custom exceptions are used to customize exceptions according to the user need
 * these exceptions extend the Exception class
 * using this we can have our own exception and message
*/

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);   //calling the constructor of parent class
    }
}

class CustomException extends Exception{

}

public class CustomExceptionExample {

    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("You are not eligible to vote");
        }
        else
            System.out.println("You are eligible to vote");
    }

    public static void main(String[] args) {
        try{
            validate(13);
        }
        catch(InvalidAgeException exc)
        {
            System.out.println("Exception occurred: "+exc);
        }

        System.out.println("Rest of the code");

        /*************/
        //Example2

        try{
            throw new CustomException(); 
        }
        catch(CustomException exc)
        {
            System.out.println("CustomException caught");
            System.out.println(exc.getMessage());   //getMessage() method returns the detailed message of the Throwable object which can also be null       }
        }
    }
}
