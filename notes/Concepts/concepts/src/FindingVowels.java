import java.util.Scanner;

public class FindingVowels {

    public static void main(String[] args) {
        int count =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = sc.nextLine();

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the phrase is: "+count);
    }
}