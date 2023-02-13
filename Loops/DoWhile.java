//Program to understand the basics and syntax of do while loop with example

/*
 * Syntax:
    initialization;
    do{
        //body
        updation;
    }while(condition);
 */
public class DoWhile {
    public static void main(String args[])
    {
        int num=1; //initialization
        do{
            System.out.println(num);
            num++;
        }while(num<=10);
    }
}
/*
 * Do while loop executes at-least once irrespective of the condition
 * After that it continues only if condition is true
 */
