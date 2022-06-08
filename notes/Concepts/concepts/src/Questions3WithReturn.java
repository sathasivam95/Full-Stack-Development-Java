

public class Questions3WithReturn {
    // Use input parameters if you don't want to keep repeating the same function
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args){

        // Using/Calling the function
        System.out.println(addition(10,2));
        System.out.println(subtraction(10,2));
        System.out.println(multiplication(10,2));
        System.out.println(division(10,2));

    }
}


