package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

/*
 * the ? symbol represents the wildcard element. It means any type
 * If we write <? extends Number> , it means any child class of Number. Now we can call the
   method of number class through any child class object. 
 * we can use a wildcard as a type of parameter, field, return type, or local variable
*/

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing rectangle");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Drawing square");
	}
}

public class WildcardExample {

	// this method accepts only child class of Shape
	public static void drawShapes(List<? extends Shape> list) {
		for (Shape s : list)
			s.draw(); // calling method of shape class by child class instance
	}

	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<>();
		list1.add(new Rectangle());

		List<Square> list2 = new ArrayList<>();
		list2.add(new Square());
		list2.add(new Square());

		drawShapes(list1);
		drawShapes(list2);

	}

}
