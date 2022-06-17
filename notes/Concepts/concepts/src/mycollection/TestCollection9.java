package mycollection;

import java.util.Hashtable;
import java.util.Map;

public class TestCollection9 {

    public static void main(String[] args){

        //Hashtable are general purpose maps
        Map<Integer, String> myMap = new Hashtable<Integer, String>();

        myMap.put(101,"Rajesh");
        myMap.put(102,"John");
        myMap.put(103,"Tom");

        System.out.println(myMap);

        System.out.println(myMap.get(102)); // use the key to fetch the value associated with the key

        for (Integer i: myMap.keySet()) {
            System.out.println(myMap.get(i));

        }

    }


}
