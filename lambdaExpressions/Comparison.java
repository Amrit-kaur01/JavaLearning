package lambdaExpressions;

interface Drawable {
	public void draw();
}

public class Comparison {
	public static void main(String[] args) {

		// without lambda, Drawable implementation is using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing without lambda");
			}
		};

		d.draw();

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing with lambda");
		};
		d2.draw();
	}
}
