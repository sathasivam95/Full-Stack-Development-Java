package exercise_enums;

import java.util.Scanner;

public class DaysLeftTillFriday {

    public static void printDaysLeft(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("4 days left till Friday");
                break;
            case TUESDAY:
                System.out.println("3 days left till Friday");
                break;
            case WEDNESDAY:
                System.out.println("2 days left till Friday");
                break;
            case THURSDAY:
                System.out.println("1 day left till Friday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("7 days left till Friday");
                break;
            case SUNDAY:
                System.out.println("6 days left till Friday");
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String user = sc.nextLine();
        switch (user) {
            case "monday":
                printDaysLeft(Days.MONDAY);
                break;
            case "tuesday":
                printDaysLeft(Days.TUESDAY);
                break;
            case "wednesday":
                printDaysLeft(Days.WEDNESDAY);
                break;
            case "thursday":
                printDaysLeft(Days.THURSDAY);
                break;
            case "friday":
                printDaysLeft(Days.FRIDAY);
                break;
            case "saturday":
                printDaysLeft(Days.SATURDAY);
                break;
            case "sunday":
                printDaysLeft(Days.SUNDAY);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }

    }
}
