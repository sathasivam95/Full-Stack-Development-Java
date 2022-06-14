package twoClasses;

public class ClassA {

    // instance
    public void methodOne(int i){

    }
    public void methodTwo(int i){

    }
    //static
    public static void methodThree(int i){


    }
    public static void methodFour(int i){

    }
}

public class ClassB extends ClassA{

    public static void methodOne(int i){

    } // instance method overrides
    public void methodTwo(int i){

    }
    public void methodThree(int i){

    } // static method hides
    public static void methodFour(int i){

    }
}