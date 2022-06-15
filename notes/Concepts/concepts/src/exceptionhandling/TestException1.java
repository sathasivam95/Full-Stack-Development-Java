package exceptionhandling;

public class TestException1 {

    //method
    // you can handle exception here (handling here would be best) OR
    public static void division(int a, int b){
        int result = 0;
        result = a/b;
        System.out.println(result);
    }

    public static void myCalc(int a, int b){
        division(a,b);
    }

    public static void main(String[] args){

        // OR you can handle exception here

        System.out.println("Before Exception!");
        try {
            division(10,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After Exception!");

    }

}
