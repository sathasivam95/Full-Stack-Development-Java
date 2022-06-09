import java.util.Scanner;

class Calculator{
    int a;
    int b;

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    int addition(){
        return a+b;
    }
    int subtraction(){
        return a-b;
    }
    int multiplication(){
        return a*b;
    }
    int division(){
        return a/b;
    }

}

public class OOPCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the operation (+,-,*,/) : ");
        String op = sc.next();
        System.out.print("Enter you second number: ");
        int b = sc.nextInt();
        int c = 0;

        Calculator obj = new Calculator(a,b);
        //for arithmetic operation
        switch (op) {
            case "+" -> c = obj.addition();
            case "-" -> c = obj.subtraction();
            case "*" -> c = obj.multiplication();
            case "/" -> c = obj.division();
            default -> System.out.println("Invalid Operation");
        }
        System.out.println("Answer: " + c);
    }

//    public static int addition(int a, int b){
//        return a+b;
//    }
//    public static int subtraction(int a, int b){
//        return a-b;
//    }
//    public static int multiplication(int a, int b){
//        return a*b;
//    }
//    public static int division(int a, int b){
//        return a/b;
//    }
}
