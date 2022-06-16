package mycollection;

import java.util.*;


public class Arguments {

    public static void main(String[] args){
        List<String> argList = new ArrayList<String>();


        Collections.shuffle(argList);

        // stream?

        // traditional enhanced for statement
        for (String rand: argList) {
            System.out.println("%s "+rand);
        }

    }

}
