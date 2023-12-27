package CollectionsEx;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.RowFilter.Entry;

public class MapDemo {
    public static void main(String[] args) {
        // Map<String, Integer>  numbers=new HashMap<>(); 
        Map<String,Integer> numbers =new TreeMap<>();
        numbers.put("one",1);
        numbers.put("Two", 2);
        numbers.put("three",3);
        numbers.put("four",4);
        System.out.println(numbers);

        System.out.println("numbers.get(\"three\"):"+numbers.get("three"));
        
        System.out.println(numbers.containsKey("Two"));

        numbers.putIfAbsent("Five", 5);

        System.out.println(numbers);


        //iterating Map using forEach
        System.out.println("Key: Value");
        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.print(" "+e +"\t");
        }
        System.out.println();
        System.out.println("Keys");
         for(String key : numbers.keySet()){
            System.out.print(" "+key+"\t");
        }
        System.out.println();
        System.out.println("Values");
         for(Integer val: numbers.values()){
            System.out.print(" "+val+"\t");
        }
    }
    
  
}
