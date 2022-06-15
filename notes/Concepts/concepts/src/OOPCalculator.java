import java.util.Scanner;

class Calculator{

    private double a;
    private double b;

    public Calculator(){}

    Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {return a;}

    public void setA(double a) {this.a = a;}

    public double getB() {return b;}

    public void setB(double b) {this.b = b;}

    double addition() {return a+b;}

    double subtraction() {return a-b;}

    double multiplication() {return a*b;}

    double division() {
        return a/b;
    }
}

// inhertiance

class ScienceCal extends Calculator{

    // x,y,z are new doubles
    private double x;
    private double y;
    private double z;

    ScienceCal(){}

    ScienceCal(double a, double b, double x, double y, double z){
        super(a, b);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public double getY() {return y;}

    public void setY(double y) {this.y = y;}

    public double getZ() {return z;}

    public void setZ(double z) {this.z = z;}

    public double advArea(double x, double y){
        double sum = x*y;
        return sum;
    }
    public double advVolume(double x, double y, double z){
        double sum = x*y*z;
        return sum;
    }

}

public class OOPCalculator {

    public static void main(String[] args) {

        double firstInt, secInt, thirdInt, fourthInt,
                fifthInt;

        Scanner basic = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        firstInt = basic.nextDouble();

        System.out.print("Enter operation (+,-,*,/) : ");
        String op = basic.next();

        System.out.print("Enter second integer: ");
        secInt = basic.nextDouble();
        double result = 0;

        Calculator nCalc = new Calculator(firstInt,secInt);

        //for arithmetic operation
        switch (op) {

            case "+": result = nCalc.addition(); break;
            case "-": result = nCalc.subtraction(); break;
            case "*": result = nCalc.multiplication(); break;
            case "/": result = nCalc.division(); break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("Answer: " + result);

        System.out.println("-----Advanced Calculator-----");
        System.out.println("--------Area of Square-------");

        Scanner advance = new Scanner(System.in);
        System.out.print("Enter height: ");
        thirdInt = advance.nextDouble();

        System.out.print("Enter width: ");
        fourthInt = advance.nextDouble();

        System.out.println("------Volume of a Cube-------");

        System.out.print("Enter side 1: ");
        fifthInt = advance.nextDouble();

        ScienceCal sCalc = new ScienceCal();

        switch (op){

            case "+": result = sCalc.addition(); break;
            case "-": result = sCalc.subtraction(); break;
            case "*": result = sCalc.multiplication(); break;
            case "/": result = sCalc.division(); break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("Answer: " + result);

    }
}




//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your first number: ");
//        double a = sc.nextDouble();
//        System.out.print("Enter the operation (+,-,*,/) : ");
//        String op = sc.next();
//        System.out.print("Enter you second number: ");
//        double b = sc.nextDouble();
//        double c = 0;




