package interfaces;

/*
 * we can nest a class inside an interface
 * the nested class is implicitly public and static
 * is useful when there is a relationship between the enclosing interface and the enclosed class 
*/

interface Animal
{
	//nested class
	public class Type
	{
		public static void type()
		{
			System.out.println("Inside type");
		}
	}
	
	public void breed();
	public void sound();
}

class Cat implements Animal
{
	public void breed()
	{
		System.out.println("Munchkin");
	}
	
	public void sound()
	{
		System.out.println("Meow");
	}
}

public class NestedClassExample {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Animal.Type.type();
		cat.breed();
		cat.sound();
	}

}
