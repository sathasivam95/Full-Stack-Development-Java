package objectMethods;

import java.util.Scanner;

class Number{

    private int num;

    public Number(int num) {this.num = num;}

    public int getNum() {return num;}

    public void setNum(int num) {this.num = num;}

    @Override
    public String toString() {
        return "" +num;
    }

}

public class IntegerToString {

    public static void main(String[] args){

        Number obj = new Number(101);
        System.out.println(obj);

    }

}
