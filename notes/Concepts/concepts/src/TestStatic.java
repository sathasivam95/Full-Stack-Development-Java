class MyClass{
    static int x; // you don't need object to call static
    float y; // private, protected and public
    boolean p;
    String q;
    public int getValueOfX(){
        return x;
    }

}

public class TestStatic {

    public static void main(String[] args){
        //Creating objects
        MyClass obj = new MyClass();

        //System.out.println(MyClass.x);
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.p);
        System.out.println(obj.q);
        System.out.println(obj.getValueOfX());
        //System.out.println(MyClass.getValueOfX());
    }
    /*
    static int x = 10; // private, protected and public

    public int getValueOfX(){
        return x;
    }
    */
}
