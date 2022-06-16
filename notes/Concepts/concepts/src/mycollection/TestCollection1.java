package mycollection;

import java.util.*;

// ArrayList --> powerful array with no predefined size

public class TestCollection1 {

    public static void main(String[] args){
        List<String> myList = new ArrayList<String>(); // an arraylist with string data type

        myList.add("Rajesh");
        myList.add("John");
        myList.add("Tom");
        myList.add("Harry");

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

        for (String name: myList) {
            System.out.println(name);

        }

        Iterator<String> itr = myList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        myList.remove("Rajesh");

        System.out.println(myList);

    }

}
