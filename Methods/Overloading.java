package Methods;

/*
 * Overloaded method means two or more methods with the same name but different arguments list
 * It is compile time polymorphism because the compiler determines at compile-time which function to call
 */
public class Overloading {

	public static void main(String[] args) {
		fun(2);
		fun("John");
	}

	static void fun(int a) {
		System.out.println("Integer value: " + a);
	}

	static void fun(String name) {
		System.out.println("String value: " + name);
	}
}
