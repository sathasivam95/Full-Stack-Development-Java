import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        Integer[] arr = {2, 34, 56, 12, 34, 1, 5};

        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(arr));

    }
}

