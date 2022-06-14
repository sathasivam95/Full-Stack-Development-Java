package mypackage;

// 1) private --> only within class
// 2) default modifier --> not outside
// (if no modifier is specified is called default)
// 3) public --> accessible inside, outside package and file

class MyPackageTest{

    public void printMe(){
        System.out.println("Hello from my package");
    }
}

public class TestPackage {

    protected void printMe(){
        System.out.println("Hello from my package");
    }

    public static void main(String[] args){

        MyPackageTest obj = new MyPackageTest();
        obj.printMe();
    }
}
