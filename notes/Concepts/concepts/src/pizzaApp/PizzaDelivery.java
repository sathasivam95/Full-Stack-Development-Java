package pizzaApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaDelivery {

    public static void printWelcomeMessage() {

        System.out.println("------------------------------------");
        System.out.println("-----Welcome to the Pizza Haven-----");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        printWelcomeMessage();

        String option = "";
        int index;
        int quantity;
        boolean app = true;
        double totalOrderCost = 0.00;
        double price;
        double previousPrice = 0.00;

        PizzaOrder order = new PizzaOrder();
        order.displayOrderInfo();

        List<Pizza> pizzas = new ArrayList<Pizza>(); // list of pizza object

        //ArrayList -- Collection
        pizzas.add(new Pizza(0,"Margherita",19.99));
        pizzas.add(new Pizza(1,"BBQ Chicken",25.99));
        pizzas.add(new Pizza(2,"Hawaiian",15.99));
        pizzas.add(new Pizza(3,"Beef Bonanza",30.99));
        pizzas.add(new Pizza(4,"Vegan Bomb",20.99));

        for (Pizza p:pizzas) {
            p.displayPizzaInfo();
        }

        Scanner sc = new Scanner(System.in);

        while (app){

            System.out.println("Please select the index from the menu for the pizza of your choice.");
            index = sc.nextInt();
            System.out.println("Please select the quantity: ");
            quantity = sc.nextInt();

            // gets the index of the pizzas object from arraylist and gets the price from it
            switch (index){

                case 0:
                    price = pizzas.get(0).getPrice();
                    totalOrderCost = price*quantity;
                    break;
                case 1:
                    price = pizzas.get(1).getPrice();
                    totalOrderCost = price*quantity;
                    break;
                case 2:
                    price = pizzas.get(2).getPrice();
                    totalOrderCost = price*quantity;
                    break;
                case 3:
                    price = pizzas.get(3).getPrice();
                    totalOrderCost = price*quantity;
                    break;
                case 4:
                    price = pizzas.get(4).getPrice();
                    totalOrderCost = price*quantity;
                    break;
            }

            System.out.println("Breakdown: " + quantity + " no of " + pizzas.get(index).getPizzaName() + " for " + totalOrderCost);

            // Ask if you want to order again
            System.out.println("Do you want to add more? (y/n)");
            option = sc.next();

            System.out.println("Your Total Cost: " +totalOrderCost );
            System.out.println("Your Order ID: " +order.getOrderID());

            if(option.equals("n")){
                System.out.println("Thanks for ordering at Pizza Haven!");
                System.out.println("See you again soon!");
                app = false;

                // ends the program
            }

        }
    }
}








