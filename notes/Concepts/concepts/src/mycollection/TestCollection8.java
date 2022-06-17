package mycollection;


// map --> key-value pair

// wrapper classes --> int --> primitive integer
//                  Integer --> wrapper class

public class TestCollection8 {

    public static void main(String[] args) {
        int x = 10; // primitive data type

        System.out.println(x);

        Integer obj = new Integer(10); // integer object

        // Boxing and Unboxing
        Integer obj1 = 11; // Boxing no need to put [new Integer();]
        obj1++; // Auto boxing takes obj1 int value increases it and then assigns it back to obj++;
        ++obj1;
        // no we increase int value of wrapper obj --> autoboxing

        System.out.println(obj1);
    }

}
