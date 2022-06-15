import java.util.InputMismatchException;
import java.util.Scanner;

public class TestIfElse {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age if you want to join the party --- ");

        try {
            int age = sc.nextInt();
            if (age<21){
                System.out.println("Sorry!, Not allowed in Party");
            }else{
                System.out.println("Welcome to party");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid Input!");

        }
    }
}