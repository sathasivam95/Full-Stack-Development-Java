package exceptionhandling;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ListOfNumbers {
    private Vector<Integer> vector ; //dynamically increase /decrease
    private static final int SIZE = 10;

    public ListOfNumbers () {
        vector = new Vector<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            vector.addElement(i);

        this.readList("");

    }

    public void readList(String fileName){ // readList
        try{
            FileReader myFile= new FileReader("resources/myfile.txt"); //reads
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                Integer i = 11;
                vector.addElement(i);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }

    }

    public static void main(String[] args) {
        new ListOfNumbers();
    }

}