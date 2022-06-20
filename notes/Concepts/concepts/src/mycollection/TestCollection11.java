package mycollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestCollection11   {
    public static void main(String[] args){


    // HashMap --> Map which is unsorted and unordered
    // Only one null key is allowed, if we try to give more than one null the latest value will be updated
    // LinkedHashMap --> means it remembers who came first, insertion order or access order
    // Map<Integer, String> myMap = new LinkedHashMap<>();
    // TreeMap --> Sorts order by using key

    // Use comparable for TreeMap
    Map<Integer, String> myMap = new TreeMap<>();

    myMap.put(104,"Harry1");
    myMap.put(101,"Rajesh");
    myMap.put(102,"John");
    myMap.put(103,"Tom");

  //  myMap.put(104,null);
   // myMap.put(105,null);
    // keys can be null
//        myMap.put(null,"Harry1");
//        myMap.put(null,"Harry2");

    System.out.println(myMap);

    System.out.println(myMap.get(102)); // use the key to fetch the value associated with the key

    for (Integer i: myMap.keySet()) {
        System.out.println(myMap.get(i));

    }


}
}
