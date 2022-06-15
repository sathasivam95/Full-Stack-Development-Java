import java.util.Scanner;

class OGCalculator{
    double a;
    double b;

    OGCalculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    double addition(){
        return a+b;
    }
    double subtraction(){
        return a-b;
    }
    double multiplication(){
        return a*b;
    }
    double division(){return a/b;}
}

public class OriginalCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the operation (+,-,*,/) : ");
        String op = sc.next();
        System.out.print("Enter you second number: ");
        double b = sc.nextDouble();
        double c = 0;

        Calculator obj = new Calculator(a,b);
        //for arithmetic operation

        switch (op) {
            case "+": c = obj.addition(); break;
            case "-": c = obj.subtraction(); break;
            case "*": c = obj.multiplication(); break;
            case "/": c = obj.division(); break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("Answer: " + c);
    }
}