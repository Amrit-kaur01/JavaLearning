package exceptionHandling;

public class NestedTryExample2 {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int[] arr = new int[5];
                    arr[10]=99;
                }
                catch(NullPointerException e)
                {
                    System.out.println(e);
                    System.out.println("inner catch block 2");
                }
                
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
                System.out.println("inner catch block 1" );
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Outer catch block");
        }
    }
}
/*
 *In the above example, the inner try block 2 did not handle the exception, hence the control was transferred
  to its parent try block i.e. inner try block 1.
 * The inner try block 1 also didn't handle the exception, so the control was trasferred to the outer(main)
   try block where the appropriate catch block handles the exception 
*/