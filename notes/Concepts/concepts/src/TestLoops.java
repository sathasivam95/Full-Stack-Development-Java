// Loops --> Doing something again and again

public class TestLoops {

    public static void main(String[] args){
        int counter = 1;
        //while loops --> while some condition is true, do something, other come out of the loop
        while (counter <= 5){
            System.out.println("Hello World!!! "+ counter); //Prints the message
            counter = counter + 1; // Increase the value of the counter
        }
        System.out.println(counter); // Condition becomes false


        /*
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        */
    }

}
