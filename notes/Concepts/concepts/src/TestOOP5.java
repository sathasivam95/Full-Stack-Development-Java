// Inheritance --> Parent-child relationship
//Is-A relationship and Has-A relationship

class Calculator2{

    private int x;
    private int y;

    public Calculator2(){}

    public Calculator2(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int addition(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int subtraction(int a, int b){
        int sum = a-b;
        return sum;
    }

}

// inheritance (extends)
// needs initialization
class ScientificCalc extends Calculator2{

    private int z;

    ScientificCalc(){}

    ScientificCalc(int x, int y, int z){
        super(x, y); // super keyword represents parent object .... calling the parent constructor from Calculator2
        this.z = z;
    }

    public void areaCalc(){
        System.out.println("Advanced area calc. ");
    }

}

public class TestOOP5 {

    public static void main(String[] args){
//        Calculator2 calc = new Calculator2();

        ScientificCalc sCalc = new ScientificCalc();
        System.out.println(sCalc.addition(20,30));
        sCalc.addition(1,3);

    }

}
