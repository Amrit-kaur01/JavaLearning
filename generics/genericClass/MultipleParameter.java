package generics.genericClass;

class Multiple<T, U> {
	T obj1;
	U obj2;

	public Multiple(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

public class MultipleParameter {
	public static void main(String[] args) {

		Multiple<Integer, String> object = new Multiple<Integer, String>(20, "Hey");
		object.print();
	}
}
