package mycollection;

import java.util.*;


// LinkedList --> good for fast insertion and deletion but slow iteration
// ArrayList --> good for fast iteration but slow insertion and deletion
// Vector --> same as ArrayList but synchronized for thread safety


public class TestCollection2 {
    public static void main(String[] args){
        List<String> myList = new Vector<String>(); // an arraylist with string data type

        myList.add("Rajesh");
        myList.add("John");
        myList.add("Tom");
        myList.add("Harry");

        System.out.println(myList);

    }

}
