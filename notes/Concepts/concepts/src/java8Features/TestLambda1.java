package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLambda1 {

    public static void main(String[] args) {
        List<Integer> mynum = Arrays.asList(2, 3, 45, 56, 23, 67, 88);

        System.out.println(mynum);

        // map,filter,reduce
        // () -> {}
        mynum.stream()
                .map(i->{return i*i;}) // map --> giving 5 inputs and apply functions on each of them and gives 5 outputs.
                .forEach(j -> System.out.println(j));

        //Stream<Integer> output = mynum.stream().map(i ->i*i);
        //System.out.println(output.collect(Collectors.toList()));

        System.out.println(mynum.stream()
                .reduce((i,j) -> i+j)
                .get()); // reduces it to one output, like addition of all the elements in the list.
    }
}
