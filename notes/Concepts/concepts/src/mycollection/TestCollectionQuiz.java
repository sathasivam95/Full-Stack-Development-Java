package mycollection;

import java.util.*;


public class TestCollectionQuiz {

    public static void main(String[] args){

        Map<String, String> foodCombos = new HashMap<>();
        foodCombos.put("PeanutButter","Jelly");
        foodCombos.put("Mac","Cheese");
        foodCombos.put("Ham","Cheese");
        foodCombos.put("Fish","Chips");
        foodCombos.put("Chicken","Waffles");
        String whatAmI = foodCombos.get("Cheese");
        System.out.println(whatAmI);

    }
}