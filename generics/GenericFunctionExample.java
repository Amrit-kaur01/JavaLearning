package generics;

/*
 * generic functions can be called with different types of arguments. Based on the type of
   the arguments passed to the generic method, the compiler handles each method call
   appropriately
 * all generic methods have a type parameter section delimited by angle brackets that
   precedes the method's return type
 * each type parameter section contains one or more type parameters separated by comma
 * type parameter is an identifier that specifies a generic type name 
 */

public class GenericFunctionExample {
	
	static <T> void genericPrint(T element)
	{
		System.out.println(element.getClass().getCanonicalName()+" = "+element);
	}

	public static void main(String[] args) {
		
		genericPrint(23);
		
		genericPrint("Hello");
		
		genericPrint(true);
	}

}
