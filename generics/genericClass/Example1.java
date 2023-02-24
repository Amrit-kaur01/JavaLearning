package generics.genericClass;
//Program to learn working of user-defined generic class

/*
 * a generic class is exactly implemented like a non-generic class
 * the only difference is that it contains a type parameter section 
 * there can be more than one type of parameter, separated by a comma
 * those classes which accept one or more parameters, are called parameterized classes
 * in parameter type we cannot use primitive types i.e. int,char,etc.
*/

class Test <T>    //we use <> to specify parameter type
{
	T obj;   //an object of type T is declared here 
	
	Test(T obj)
	{
		this.obj = obj;
	}
	
	public T getObj()
	{
		return obj;
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		//Instance of integer type
		Test<Integer> intObj = new Test<Integer>(15);
		System.out.println(intObj.getObj());
		
		//instance of String type
		Test<String> strObj = new Test<String>("Hey");
		System.out.println(strObj.getObj());
	}
	
}
