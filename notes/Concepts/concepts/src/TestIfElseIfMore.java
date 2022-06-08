import java.util.Objects;
import java.util.Scanner;

public class TestIfElseIfMore {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age if you want to join the party --- ");
        int age = sc.nextInt();
        System.out.println("Are you single (Type True or False)--- ");
        boolean status = sc.nextBoolean();
        System.out.println("Do you have shoes (Type True or False)--- ");
        boolean shoes = sc.nextBoolean();

        if(age<21){
            System.out.println("You are not allowed to the party as you are below 21");
        }else if (status){
            System.out.println("You are not allowed to the party as you are single");
        }else if (!shoes){
            System.out.println("You are not allowed to the party as you are not wearing shoes");
        }else {
            System.out.println("You are allowed to the party.");
        }
    }
}