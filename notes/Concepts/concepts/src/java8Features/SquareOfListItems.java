package java8Features;

import java.util.Arrays;
import java.util.List;

public class SquareOfListItems {
    public static void main(String[] args) {
        List<Integer> mynum = Arrays.asList(2, 3, 45, 56, 23, 67, 88);

        System.out.println(mynum);

        // returns the square of no
        mynum.stream()
                .distinct()
                .forEach(n -> System.out.println((int)Math.pow(n, 2)));

        // returns the even no
        mynum.stream()
                .filter((i) -> {return i%2==0;})
                .forEach(System.out::println); // method reference

        // returns the odd no
        mynum.stream()
                .filter((i) -> {return i%2!=0;})
                .forEach(System.out::println);


    }
}
