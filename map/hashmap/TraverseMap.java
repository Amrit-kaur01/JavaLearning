package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TraverseMap {
    public static void main(String[] args) {
        
        Map<Integer,String> rollNoMap = new HashMap<>();
        int rno[] = {1,2,3,4,5};
        String[] names = {"Aman","Bob","Cathy", "David", "Emily"};

        for(int i=0;i<5;i++)
            rollNoMap.put(rno[i], names[i]);

        //Traversing the map using for-each loop
        for(Entry<Integer, String> mapEntry : rollNoMap.entrySet())
        {
            int key = mapEntry.getKey();
            String value = mapEntry.getValue();
            System.out.println(key+":"+value);
        }

        //Traversing the map using iterator()
        Set set = rollNoMap.entrySet();   //A map can't be traversed so you need to convert it into Set using keySet() or entrySet() method
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("rollno: "+entry.getKey()+", Name: "+entry.getValue());
        }
        

        //Traversing using forEach()
        rollNoMap.forEach((key,value) -> System.out.println(key+":"+value));
        
    }
}
