package objectMethods;

// object class --> parent class
// special methods --> to be used almost everywhere
// 1) toString() -->
//

import java.util.Objects;
import java.util.Scanner;

//POJO - plain old java objects
class Person{

    private int ssn;
    private String name;
    private int num;

    public Person(int ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "ssn=" + ssn +
//                ", name='" + name + '\'' +
//                '}';
//    }

    // its is compulsory
    @Override
    public boolean equals(Object o) { //different object or same object?
        if(this.getName()== ((Person)o).getName())
            return true;
        else
            return false;
    }

    // for better search performance
    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

}

public class TestObjectClassMethods {

    public static void main(String[] args){

        Person p1 = new Person(101,"John");
        Person p2 = new Person(101,"John");

//        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);


    }
}
