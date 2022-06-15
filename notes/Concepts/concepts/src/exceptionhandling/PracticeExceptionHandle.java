package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeExceptionHandle {

    public static void main(String[] args) {
    try {
        int a, b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Integer A: ");
        a = Integer.parseInt(in.readLine());
        System.out.print("Integer B: ");
        b = Integer.parseInt(in.readLine());

    } catch (NumberFormatException | IOException e){
        System.out.println(e.getMessage() + " is not a numeric value.");
        System.exit(0);
        }
    }
}
// types of exception NumberFormatException and IOException