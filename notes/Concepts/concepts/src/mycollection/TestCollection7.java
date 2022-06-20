package mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student6 {
    private int id;
    private String name;

    public Student6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student6{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this.getId() == ((Student6)o).getId()){
            return true;
        }else {
            return false;
        }
    }

    //for better search performance
    @Override
    public int hashCode() {
        return 5;
    }

}

class MyStudentComparator implements Comparator<Student6>{

    @Override
    public int compare(Student6 o1, Student6 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class TestCollection7 {
    public static void main(String[] args) {
        Student6 st1 = new Student6(101, "Rajesh");
        Student6 st2 = new Student6(102, "Tom");
        Student6 st3 = new Student6(103, "John");
        Student6 st4 = new Student6(104, "Harry");

        ArrayList<Student6> mylist = new ArrayList<>();

        mylist.add(st1);
        mylist.add(st3);
        mylist.add(st4);
        mylist.add(st2);

        System.out.println(mylist);

        Collections.sort(mylist,new MyStudentComparator());

        System.out.println(mylist);

    }
}