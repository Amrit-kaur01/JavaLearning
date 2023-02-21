package Methods;

/*
 * Shadowing means the practice of using variables in overlapping scopes with the same name
 * variable in low-level scope overrides thevariable of high-level scope
 * variable at high-level scope is shadowed by the low-level scope variable
 * 
 */

 //Outer class
public class Shadowing {
    String name= "Outer name";

    //Inne class
    class InnerShadowing{
        String name= "Inner name";

        //Method to print the names
        public void print(String name)
        {
            System.out.println(name); //This will print the value of name variable that is passed to the function
            System.out.println(this.name); //This will print the name variable of inner class
            System.out.println(Shadowing.this.name); //This will print the name variable of outer class
        }
    }

    public static void main(String args[])
    {
        Shadowing obj = new Shadowing();

        Shadowing.InnerShadowing innerObj = obj.new InnerShadowing();
        innerObj.print("James");
    }
    
}
