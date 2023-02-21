package exceptionHandling;

import java.sql.SQLException;

/*
 * throws keyword is used to declare an exception. It is used in signature of the method
 * it gives information to the programmer that there may occur an exception
 * thus the programmer knows that in this case exception handling code is required
 * exception handling is mainly used to handle the checked exceptions 
 * only checked exception needs to be declared because unchecked exception is under our control so we
  can correct our code.
 * throws keyword can be used to declare multiple exceptions which can be thrown by the method
*/

public class Throws_Example {

    void m() throws SQLException
    {
        throw new SQLException("sql error");
    }

    void n() throws SQLException
    {
        m();  //we are calling a method that declares an exception. So we must either catch it or declare the exception. Here I declared the exception
    }

    void p()
    {
        try{
            n();
        }
        catch(SQLException e)
        {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        Throws_Example obj =new Throws_Example();
        obj.p();
        System.out.println("Rest of the code");
    }
}
