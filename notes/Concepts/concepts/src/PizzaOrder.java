import java.util.Scanner;

//Whatever we write in class is in actual the property of object as we are
//describing the object. If you want anything which should belong to class make it static !!
class Pizza {

    // properties of menu
    String pizzaName;
    int price;

    //constructor
    public Pizza(String pizzaName, int price){
        this.pizzaName = pizzaName;
        this.price = price;
    }

    //method to calculate total bill from the pizza order
    public void totalBill(int quantity){
        price = price * quantity;
    }

    public String getPizzaName(){
        return pizzaName;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        String result = "";
        result = "You have selected " + pizzaName + " as the pizza of your choice for $" +;
        return result;
    }

}


// once instantiated the pizza object will the properties and behaviour
// in Main create the pizza object

// the template
public class PizzaOrder {

    public static void main(String[] args) {

        String pizzaName;
        int quantity;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index of the Pizza: ");
        pizzaName = sc.next();

        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();

        Pizza pizza1 = new Pizza(pizzaName, quantity);

        System.out.println(pizza1.toString());

        //Instantiate Objects

//        Pizza pizza2 = new Pizza("BBQ Chicken",25);
//        Pizza pizza3 = new Pizza("Hawaiian",15);
//        Pizza pizza4 = new Pizza("Beef Bonanza",30);
//        Pizza pizza5 = new Pizza("Vegetarian",28);

        pizza1.totalBill(8);
        System.out.println(pizza1.getPrice());

    }

}














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
//        System.out.println("Pizza: " + name);
//        System.out.println("Size: " + size);
//        System.out.println("Price: " + price);
//        System.out.println("-----------------");
//    }
//}
//
//
//public class PizzaApp {
//
//    public static void main(String[] args) {
//
//        // Create an Object: Pizza
//        System.out.println("-----Welcome to Pizza Haven-----");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int index = sc.nextInt();
//        System.out.print("Enter you quantity: ");
//        int quantity = sc.nextInt();
//        Pizza pizza1 = new Pizza();
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