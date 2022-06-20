package java8Features;

import java.util.Arrays;
import java.util.List;

public class TestJava8Features2 {
    public static void main(String[] args){
        List<Integer> mynum = Arrays.asList(2,3,45,56,23,67,88);

        System.out.println(mynum);


        // returns the even no
        mynum.stream().filter((i) -> {return i%2==0;}).forEach((i)->{
            System.out.println(i);
        });


//        for(int i=0; i<= mynum.size(); i++){
//            if(mynum.get(i)%2==0){
//                System.out.println(mynum.get(i));
//            }
//        }



    }
}
