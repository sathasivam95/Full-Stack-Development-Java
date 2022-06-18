package pizzaApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Whatever we write in class is in actual the property of object as we are
//describing the object. If you want anything which should belong to class make it static !!
// once instantiated the pizza object will the properties and behaviour
// in Main create the pizza object

// the template


public class PizzaApp {

    public static void printWelcomeMessage() {
        System.out.println("------------------------------------");
        System.out.println("-----Welcome to the Pizza Haven-----");
        System.out.println("---------Here is the Menu-----------");
    }

    public static void main(String[] args) {

        printWelcomeMessage();

        int index;
        int quantity;
        String option;

        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();


        System.out.println("(1) Margherita  ---------------- $19.99");
        System.out.println("(2) BBQ Chicken ---------------- $25.99");
        System.out.println("(3) Hawaiian ------------------- $15.99");
        System.out.println("(4) Beef Bonanza --------------- $30.99");
        System.out.println("(5) Vegetarian ----------------- $20.99");

        System.out.println("Please select the index in the menu for the pizza of your choice.");
        index = sc.nextInt();
        System.out.println("Please select the quantity.");
        quantity = sc.nextInt();
        System.out.println("Do you want anything else? (y/n)");
        option = sc.nextLine();


    }
}





        // Reading input regarding pizza index and pizza qty
//        for(int i=1; i<=quantity; i++) {
//            Pizza pizza = new Pizza();
//
//        }





//        // Creating PizzaOrder object and relevant information with regards to order
//        PizzaOrder order = new PizzaOrder(pizzas);
//        order.calculateTotalOrderCost();
//        order.printOrderSummary();
//
//        // Cleanup
//        scanner.close();
//    }
//}







//           System.out.println("---------Here is the Menu-----------");
//           System.out.println("(1) Margherita  ---------------- $18");
//           System.out.println("(2) BBQ Chicken ---------------- $25");
//           System.out.println("(3) Hawaiian ------------------- $15");
//           System.out.println("(4) Beef Bonanza --------------- $30");
//
//           int pizzaIndex;
//           int quantity;
//           int totalBill;
//
//
//           pizzaApp.Pizza pizza1 = new pizzaApp.Pizza("Margherita",1,18);
//           pizzaApp.Pizza pizza2 = new pizzaApp.Pizza("BBQ Chicken",2,25);
//           pizzaApp.Pizza pizza3 = new pizzaApp.Pizza("Hawaiian",3,15);
//           pizzaApp.Pizza pizza4 = new pizzaApp.Pizza("Beef Bonanza",4,30);
//
//           Scanner sc = new Scanner(System.in);
//
//           System.out.print("Enter the index of the pizzaApp.Pizza: ");
//           pizzaIndex = sc.nextInt();
//
//           System.out.print("Enter the quantity: ");
//           quantity = sc.nextInt();
//









//    // Attributes
//    String name;
//    String size;
//    double price;
//    int index;
//
//    //Constructor
//
//    //Method (Behaviour)
//    //To write data in Product Object we have this Method
//    void setPizza(String name, String size, double price, int index){
//        this.name = name;
//        this.size = size;
//        this.price = price;
//        this.index = index;
//    }
//    // To read data from Product object
//    void showPizzaDetails(){
//
//        System.out.println("-----------------");
//        System.out.println("---------"+ index +"-----------");
//        System.out.println("pizzaApp.Pizza: " + name);
//        System.out.println("Size: " + size);
//        System.out.println("Price: " + price);
//        System.out.println("-----------------");
//    }
//}
//
//
//public class pizzaApp.PizzaApp {
//
//    public static void main(String[] args) {
//
//        // Create an Object: pizzaApp.Pizza
//        System.out.println("-----Welcome to pizzaApp.Pizza Haven-----");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int index = sc.nextInt();
//        System.out.print("Enter you quantity: ");
//        int quantity = sc.nextInt();
//        pizzaApp.Pizza pizza1 = new pizzaApp.Pizza();
//
//        // Writing data in Object
//        pizza1.setPizza("Margherita","Regular",20,1);
//
//        // Reading data from Object
//        pizza1.showPizzaDetails();
//
//    }
//}
//
////        System.out.println("--------Here is the Menu-------");
////        System.out.println("Margherita -- Reg -- $20");
////        System.out.println("BBQ Chicken -- Reg -- $25");
////        System.out.println("Beef Bonanza -- Reg -- $40");
////        System.out.println("Hawaiian -- Reg -- $35");
////        System.out.println("Vegetarian -- Reg -- $20");