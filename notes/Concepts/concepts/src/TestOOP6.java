// over-riding --> using latest version of method implementation in parent child hireachy
//inheritance
class Parent{

    public void myIntro(){
        System.out.println("Hello from parent.");
    }
}

class Child extends Parent{

    @Override
    public void myIntro() {
        System.out.println("Hello from child");
    }
}

public class TestOOP6 {

    public static void main(String[] args){

        Parent obj = new Child();
        obj.myIntro(); // this is not overriding -- it chooses parent due to the parameters supplied
//        Child obj = new Child();
//        obj.myIntro();
    }
}
