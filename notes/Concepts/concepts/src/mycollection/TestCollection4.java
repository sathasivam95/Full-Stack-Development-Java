package mycollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestCollection4 {

    public static void main(String[] args){

        Set<String> myset = new LinkedHashSet<>(); // general purpose unordered, unsorted, takes only unique item

        myset.add("Rajesh");
        myset.add("John");
        myset.add("Tom");
        myset.add("Tom");

        System.out.println(myset);
    }
}

