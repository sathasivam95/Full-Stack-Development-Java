package mycollection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection5 {

    public static void main(String[] args) {

        Set<String> myset = new TreeSet<>(); // general purpose unordered, unsorted, takes only unique item

        myset.add("Rajesh");
        myset.add("John");
        myset.add("Tom");
        myset.add("Tom");

        System.out.println(myset);
    }
}