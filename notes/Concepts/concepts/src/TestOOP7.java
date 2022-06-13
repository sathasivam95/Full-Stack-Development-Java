// abstraction --> some details
// can be provided later we can only
// decide on the body of the method (e.g., Contracts)
// 2 ways for achieving abstraction
// 1) Abstract class --> concrete as well as abstract method
// 2) Interface

// Spend this week to do MCQ

abstract class MyAbstractClass{

    //methods --> 1) concrete Method --> both body and definition
    //            2) abstract Method --> definition Part
    abstract public void myGreetings(String name); // abstract method

    public void printMe(){
        System.out.println("Hello from abstract class.");// concrete method
    }

}

class EnglishCommunity extends MyAbstractClass{

    @Override
    public void myGreetings(String name) {
        System.out.println("Good Morning Mr/Mrs " +name);
    }
}

class GermanCommunity extends MyAbstractClass{

    @Override
    public void myGreetings(String name) {
        System.out.println("Gluten Morgun Mr/Mrs " +name);
    }
}

public class TestOOP7{

    public static void main(String[] args){
        EnglishCommunity obj = new EnglishCommunity();
        GermanCommunity obj1 = new GermanCommunity();

        obj.myGreetings("John");
        obj.printMe();
        obj1.myGreetings("Schwick");
        obj1.printMe();
    }

}
