

public class Question3WoReturn {

    public static void addition(int a, int b){
        int result = a+b;
        System.out.println("Addition: "+result);
    }

    public static void subtraction(int a, int b){
        int result = a-b;
        System.out.println("Subtraction: " +result);
    }

    public static void multiplication(int a, int b){
        int result = a*b;
        System.out.println("Multiplication: "+result);
    }

    public static void division(int a, int b){
        int result = 0;
        try{
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() +result);
        }
        System.out.println("Division: "+result);
    }

    public static void main(String[] args){

        addition(10,2);
        subtraction(10,2);
        multiplication(10,2);
        division(10,0);

    }
}
