
class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here

        for (int i = 1; i <=n; i++)
        {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
             // if i is a multiple of both 3 and 5,print FizzBuzz
            else if (i % 3 == 0)
                System.out.println("Fizz"); // if i is a multiple of 3(but not 5), print Fizz
             else if (i % 5 == 0)
                System.out.println("Buzz"); // if i is a multiple of 5(but not 3), print Buzz
             else
                System.out.println(i); // if i is not a multiple of 3 or 5, print the value of i
        }
    }
}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        Result.fizzBuzz(n);
//
//        bufferedReader.close();
//        }
//}
