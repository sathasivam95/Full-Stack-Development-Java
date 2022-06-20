package pizzaapp;

import java.util.*;

class PizzaOrder {

    private int orderID;
    private String customerName;

    public PizzaOrder(){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        customerName = sc.nextLine();

        int upperBound = 10000;
        orderID = rand.nextInt(upperBound);

    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void displayCustomerOrderInfo(){
        System.out.println("------------------------------------");
        System.out.println("Welcome " +customerName+ "\nYour Order ID is " +orderID);
        System.out.println("------------------------------------");
    }


}



































//    private double totalOrderCost;
//    private final ArrayList<Pizza> pizzas;
//    private int qty;
//
//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public PizzaOrder(ArrayList<Pizza> pizzas) {
//        this.pizzas = pizzas;
//    }
//
//    public void calculateTotalOrderCost() {
//        final double Margherita = 18.99;
//        final double BBQ_Chicken = 25.99;
//        final double Hawaiian = 15.00;
//        final double Beef_Bonanza = 30.00;
//
//        for (Pizza pizza : pizzas) {
//            switch (pizza.getIndex()) {
//                case 1:
//                    System.out.println("Margherita");
//                    totalOrderCost += Margherita;
//                    break;
//                case 2:
//                    totalOrderCost += BBQ_Chicken;
//                    break;
//                case 3:
//                    totalOrderCost += Hawaiian;
//                    break;
//                case 4:
//                    totalOrderCost += Beef_Bonanza;
//                    break;
//                default:
//                    totalOrderCost += 0.0;
//                    break;
//            }
//        }
//    }
//
//    public double getTotalOrderCost() {
//        return totalOrderCost*getQty();
//    }
//
//
//    public void printOrderSummary() {
//        for (Pizza pizza : pizzas) {
//            System.out.println("Ordered a " + pizza.getIndex());
//        }
//        System.out.println("TotalOrder: " + getTotalOrderCost());
//    }
//}
//



//    final double Margherita = 18.99;
//    final double BBQ_Chicken = 25.99;
//    final double Hawaiian = 15.00;
//    final double Beef_Bonanza = 30.00;