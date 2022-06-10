import java.util.Random;
        import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        int counter;
        int selection;

        Scanner sc = new Scanner(System.in);

        Random comp = new Random();

        System.out.println("---Tic-Tac-Toe---");
        System.out.print("How many rounds do you want to play? ");
        counter = sc.nextInt();

        if (counter>10)
            System.out.println("Sorry you are only allowed to play ten rounds.");
        else {
            System.out.print("Select (1) Rock, (2) Paper, (3) Scissors");
            selection = sc.nextInt();
        }
    }
}
