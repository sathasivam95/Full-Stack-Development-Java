// Interface will only have abstract method (e.g., like a contract)

// difference between abstract class and interface
// 1) Abstract class can have both methods, Inter only have abstract
// 2) Abstract class can extend only one class at a time by we can implement multiple interfaces.

// What an interface does is define a
// set of methods that provide standard behaviors
// that any type that implements the interface must provide.

interface CentralBank{

    // defining a method with/without return types
    void getEMI(int rate);

}

interface WorldBank{

    void getWorldEMI(int rate);

}

// each team is free to develop their private implementations w/o
// affecting other parts of the programs
// Class implements the interface
class HSBC implements CentralBank, WorldBank{

    public void getEMI(int rate) {
            System.out.println("so the HSBC EMI will be from central bank" + rate*2);
        }

    @Override
    public void getWorldEMI(int rate) {
        System.out.println("so the HSBC EMI will be from world bank" + rate*8);
    }
}

class OCBC implements CentralBank{

    public void getEMI(int rate) {
        System.out.println("so the HSBC EMI will be " + rate*3);
    }
}


public class TestOOP8 {

    public static void main(String[] args){

        HSBC obj = new HSBC();
        OCBC obj1 = new OCBC();

        obj.getEMI(10);
        obj1.getEMI(10);

    }

}
