package streamAPI;
import java.util.*;
import java.util.stream.*;

class Laptop{
    int id;
    String name;
    float price;

    Laptop(int id, String name, float price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class LaptopObject{
    public static void main(String[] args)
    {
        List<Laptop> laptopsList = new ArrayList<Laptop>();

        //Adding objects
        laptopsList.add(new Laptop(1, "Dell", 40000f));
        laptopsList.add(new Laptop(2, "HP", 45000f));
        laptopsList.add(new Laptop(3, "Macbook", 100000f));
        laptopsList.add(new Laptop(4, "Asus", 80000f));

        List<Float> priceList = laptopsList.stream()
                                    .filter(l -> l.price>50000)
                                    .map(l -> l.price)
                                    .collect(Collectors.toList());
        
        System.out.println(priceList);

        //another example of filtering data
        laptopsList.stream()
                .filter(laptop -> laptop.price>50000)
                .forEach(laptop -> System.out.println(laptop.name));

        //using reduce method
        //reduce method takes a sequence of input elements and combines them into a single summary result by repeated operation
        //for example, finding the sum of numbers, or accumulating elements into a list
        Float totalPrice = laptopsList.stream()
                                .map(laptop -> laptop.price)
                                .reduce(0.0f, (sum,price) -> sum+price);
        System.out.println("Total price:" + totalPrice);



        //using max() method to get max product price
        Laptop laptopMaxPrice = laptopsList.stream()
                                    .max((laptop1, laptop2) -> laptop1.price>laptop2.price?1:-1)
                                    .get();
        System.out.println("Laptop with max price :"+ laptopMaxPrice.name);

        //using min() method to get the min product price
        Laptop laptopMinPrice = laptopsList.stream()
                                    .min((laptop1, laptop2) -> laptop1.price>laptop2.price?1:-1)
                                    .get();

        System.out.println("Laptop with min price :"+ laptopMinPrice.name);

        //count number of laptops based on the filter
        long count = laptopsList.stream()
                            .filter(laptop -> laptop.price<50000)
                            .count();
        System.out.println("Number of laptops with price less than 50000: "+count);

        //Converting laptop list into set
        Set<String> laptopNamesSet = laptopsList.stream()
                                                .map(laptop -> laptop.name)
                                                .collect(Collectors.toSet());
        System.out.println(laptopNamesSet);


        //converting laptop list into map
        Map<Integer,String> laptopMap = laptopsList.stream()
                                                    .collect(Collectors.toMap(l -> l.id, l -> l.name));
        System.out.println(laptopMap);
    }
}