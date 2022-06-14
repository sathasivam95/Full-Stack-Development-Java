package mypackage;

public class TestPackageInside {

    public static void main(String[] args) {
//    MyPackageTest obj = new MyPackageTest(); // not available because its defualt
        MyPackageTest obj = new MyPackageTest();
        obj.printMe();
        TestPackage obj2 = new TestPackage();
        obj2.printMe(); //protected but availabe outside package due to inheritance
    }
}
