package pizzaapp;

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

        String addMore = "";
        int index;
        int previousQuantity;
        int quantity;
        boolean app = true;
        double totalOrderCost = 0.00;
        double currentPrice;

        PizzaOrder order = new PizzaOrder();
        order.displayCustomerOrderInfo();

        List<Pizza> pizzas = new ArrayList<Pizza>(); // list of pizza object

        //ArrayList -- Collection
        pizzas.add(new Pizza(0,"Margherita",19.99));
        pizzas.add(new Pizza(1,"BBQ Chicken",25.99));
        pizzas.add(new Pizza(2,"Hawaiian",15.99));
        pizzas.add(new Pizza(3,"Beef Bonanza",30.99));
        pizzas.add(new Pizza(4,"Vegan Bomb",20.99));

        // Stream API and Lambda Reference
        // Displays the menu
        pizzas.forEach(Pizza::displayPizzaInfo);

        Scanner sc = new Scanner(System.in);

        while(app){

            System.out.println("------------------------------------");
            System.out.println("Please select the index from the menu for the pizza of your choice.");
            index = sc.nextInt();
            System.out.println("Please select the quantity: ");
            quantity = sc.nextInt();

            // gets the index of the pizzas object from arraylist and gets the price from it

            switch (index){

                case 0:
                    currentPrice = pizzas.get(0).getPrice();
                    totalOrderCost = currentPrice*quantity;
                    break;
                case 1:
                    currentPrice = pizzas.get(1).getPrice();
                    totalOrderCost = currentPrice*quantity;
                    break;
                case 2:
                    currentPrice = pizzas.get(2).getPrice();
                    totalOrderCost = currentPrice*quantity;
                    break;
                case 3:
                    currentPrice = pizzas.get(3).getPrice();
                    totalOrderCost = currentPrice*quantity;
                    break;
                case 4:
                    currentPrice = pizzas.get(4).getPrice();
                    totalOrderCost = currentPrice*quantity;
                    break;

            }

            // Ask if you want to order again
            System.out.println("Do you want to add more? (y/n)");
            addMore = sc.next();

            if(addMore.equals("n")){

                System.out.println("Cost Breakdown: " + quantity + " no of " + pizzas.get(index).getPizzaName() + " for " + totalOrderCost);
                System.out.println("------------------------------------");
                System.out.println("Your Total Cost: " +totalOrderCost );
                System.out.println("Your Order ID: " +order.getOrderID());
                System.out.println("------------------------------------");
                System.out.println("Thanks for ordering at Pizza Haven!");
                System.out.println("See you again soon!");
                System.out.println("------------------------------------");
                app = false;
                // ends the program
            }
        }

    }
}

//Together
//        Cost Breakdown: 2 no of Margherita for $39.98.
//        Cost Breakdown: 4 no of BBQ Chicken for $103.96
//        Your total cost $143.94


