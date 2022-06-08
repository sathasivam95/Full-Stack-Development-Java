import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade within the range of 0-100 --- ");
        float marks = sc.nextFloat();

        if (marks <= 100 && marks >= 90) {
            System.out.println("You scored A");

        }else if(marks < 90 && marks >= 80 ){
            System.out.println("You scored B");

        }else if(marks < 80 && marks >= 70 ){
            System.out.println("You scored C");

        }else{
            System.out.println("You Failed!");
        }
    }
}
