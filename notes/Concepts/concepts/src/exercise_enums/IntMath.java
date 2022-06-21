package exercise_enums;

import java.util.Scanner;

public class IntMath {

    public int calculate(Operators operators, int operand1, int operand2) {

        switch(operators) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args){
        IntMath op = new IntMath();

        int result1 = op.calculate(Operators.PLUS, 20,2);
        int result2 = op.calculate(Operators.MINUS, 20,2);
        int result3 = op.calculate(Operators.MULTIPLY, 20,2);
        int result4 = op.calculate(Operators.DIVIDE, 20,2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}
