//Basics of abstraction

/*
 * Implementing abstraction using abstract classes
 * abstract class is defined using the keyword abstract
 * abstract classes cannot be instantiated
 * it can have constructors,static, and final methods
 */

 /*
  * Syntax
    abstract class <classname>{
        public abstract void abstractMethod();

        public void normalMethod{
            //body
        }
    }
  */

//abstract class
abstract class Sport{
    abstract void rules();  //abstract methods do not have any implementation and they are declared in abstract classes only
}

//concrete class
class Cricket extends Sport{
    void rules()  //sub-class overriding the abstract method
    {
        System.out.println("Rules of cricket");
    }
}

//concrete class
class Tennis extends Sport{
    void rules()
    {
        System.out.println("rules of tennis");
    }
}

class Basics{
    public static void main(String[] args) {
        Sport sport;
        sport = new Cricket(); //concrete class object
        sport.rules();

        sport = new Tennis();
        sport.rules();
    }
    
}

/*
 * abstract static and abstract private is illegal in java
 */