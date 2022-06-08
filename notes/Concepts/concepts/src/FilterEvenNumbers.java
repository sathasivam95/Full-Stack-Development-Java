import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(2,3,55,65,42,67);
        List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even List "+ even);
    }
}
