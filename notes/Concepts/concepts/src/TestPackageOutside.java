import mypackage.TestPackage;

public class TestPackageOutside extends TestPackage {

    public static void main(String[] args){
        TestPackage obj1 = new TestPackage();
         // cause its protected
        TestPackageOutside obj2 = new TestPackageOutside();
        obj2.printMe(); //protected but availabe outside package due to inheritance


    }


}
