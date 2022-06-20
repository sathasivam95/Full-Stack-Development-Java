package pizzaapp;

public class Pizza {

    private int index;
    private String pizzaName;
    private double price; // get and set because there are private methods

    // Constructor
    public Pizza(int index, String pizzaName, double price) {
        this.index = index;
        this.pizzaName = pizzaName;
        this.price = price;
    }

    public int getIndex(int i) { // accessor method
        return index;
    }

    public void setIndex(int index) { // mutator method
        this.index = index;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayPizzaInfo(){
        System.out.println("(" + index + ")" + " Pizza: " +pizzaName+ " Price: "+price);
    }


}

