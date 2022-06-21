import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

// define fixed operations
// prevents accidental declaration
enum Mydays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum CoffeeSize{
    SMALL(100),
    MEDIUM(200),
    LARGE(300);

    private final int quantity; // weightage

    CoffeeSize(int quantity){
        this.quantity = quantity;
    }


}

class StarBucks{

    int price;
    String name;
    //String coffee_size;
    CoffeeSize size;

}


public class TestEnum {
    public static void main(String[] args) {
        Mydays day1 = Mydays.SUNDAY;
        Mydays day2 = Mydays.FRIDAY;


        System.out.println(day1);

        StarBucks pumpkinLatte = new StarBucks();
        pumpkinLatte.price=20;
        pumpkinLatte.name="Pumpkin Latte";
        pumpkinLatte.size=CoffeeSize.MEDIUM;

        System.out.println(pumpkinLatte);


    }
}
