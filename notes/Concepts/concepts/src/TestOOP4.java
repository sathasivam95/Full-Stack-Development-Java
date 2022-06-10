class Calculator1{

    private int x;
    private int y;

//    public Calculator1(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

    public Calculator1() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Method overload --> same name method but with different no or type of para
    //automatically decides which addition to call depending on no type of para
    public int addition(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int addition(int a, int b,int c){
        int sum = a+b+c;
        return sum;
    }

}

public class TestOOP4 {

    public static void main(String[] args){
        Calculator1 calc = new Calculator1();
        System.out.println(calc.addition(20,30));
        System.out.println(calc.addition(20,30,40));

    }

}
