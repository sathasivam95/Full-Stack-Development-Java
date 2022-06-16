package mycollection;

import java.util.HashSet;
import java.util.Set;

public class TestCollection3 {

    public static void main(String[] args){
        Set<String> myset = new HashSet<>(); // general purpose unordered, unsorted, takes only unique item
        myset.add("Rajesh");
        myset.add("John");
        myset.add("Tom");
        myset.add("tom");
        System.out.println(myset);
    }
}
