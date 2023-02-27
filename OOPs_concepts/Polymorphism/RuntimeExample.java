package OOPs_concepts.Polymorphism;

class Mobile {
	void call() {
		System.out.println("Mobile call");
	}
}

class IPhone extends Mobile {
	void call() {
		System.out.println("IPhone calling");
	}
}

class OnePlus extends Mobile {
	void call() {
		System.out.println("OnePlus calling");
	}
}

class Xiaomi extends Mobile {
	void call() {
		System.out.println("Xiaomi calling");
	}
}

public class RuntimeExample {
	public static void main(String[] args) {
		Mobile mob;
		mob = new IPhone();
		mob.call();

		mob = new OnePlus();
		mob.call();

		mob = new Xiaomi();
		mob.call();
	}

}

/*
 * Method is overridden, not the data members, so runtime polymorphism can't be
 * achieved by data members
 */