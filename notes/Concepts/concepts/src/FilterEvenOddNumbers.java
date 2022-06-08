import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOddNumbers {
    public static void main(String[] args){

        List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,
                28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50);
        List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> odd=list.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Even List "+ even);
        System.out.println("Odd List "+ odd);
    }
}

