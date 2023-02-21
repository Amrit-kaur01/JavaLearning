package lambdaExpressions;

/*
 * lambda expression can be used in the collection framework
 * provides efficient way to iterate, filter and fetch data
*/

import java.util.*;

class Laptop{
	int id;
	String name;
	float price;
	
	public Laptop(int id,String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Example3 {
	public static void main(String[] args) {
		
		List<Laptop> laptopsList = new ArrayList<Laptop>();
		laptopsList.add(new Laptop(1,"Dell",45000));
		laptopsList.add(new Laptop(1,"HP",50000));
		laptopsList.add(new Laptop(1,"Asus",80000));
		
		Collections.sort(laptopsList, (l1,l2) -> {
			return l1.name.compareTo(l2.name);
		});;
		
		laptopsList.forEach(laptop -> System.out.println(laptop.id+", "+laptop.name+", "+laptop.price));
	}
}
