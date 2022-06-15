package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {

    // throws keyword says throw this exception as of now lets handle later
    public static void readMyFile() throws FileNotFoundException {
        FileReader reader = new FileReader("resources/myfile.txt");

        try {
            System.out.println(reader.read());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args){

        System.out.println("Before Exception!");
        try {
            readMyFile();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After Exception!");

    }

}
