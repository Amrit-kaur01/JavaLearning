package OOPs_concepts.Polymorphism;
/*
 * Runtime polymorhpism also called dynamic method dispatch is a process in which call to an overridden method is resolved at run-time rather than compile-time
 * overridden method is called through the refernece variable of a superclass
 * determination of the method to be called is based on the object being referred to by the refernece variable
 * method invocation is determined by the JVM not compiler hence runtime polymorphism
 */

 class Bike{
    void run()
    {
        System.out.println("Running");
    }
 }

 class Splendor extends Bike{

    void run()
    {
        System.out.println("Splendor running");
    }

 }


public class Runtime {
    public static void main(String[] args) {
        Bike b=new Splendor(); //upcasting: reference variable of parent class refers to the object of child class
        b.run(); //this will call the run method in splendor class
    }
}
