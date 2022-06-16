package mycollection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

class Student4 implements Comparable<Student4>{

    private int id;
    private String name;

    public Student4(int id, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student4 = (Student4) o;
        return id == student4.id && Objects.equals(name, student4.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student4 {" +
                " name= '" + name + '\'' +
                '}';
    }

    // logic for sorting comparison
    // comparing string
    @Override
    public int compareTo(Student4 o) {
        if (this.getId() >= o.getId()){
            return 2;
        } else if ((this.getId() <= o.getId())) {
            return -2;
        }else{
            return 0; // equate to equals
        }
    }
}



public class TestCollection6 {

    public static void main(String[] args) {
        Student4 st1 = new Student4(101, "Rajesh");
        Student4 st2 = new Student4(102, "Tom");
        Student4 st3 = new Student4(102, "John");
        Student4 st4 = new Student4(104, "Harry");

        ArrayList<Student4> myList = new ArrayList<>();

        myList.add(st1);
        myList.add(st3);
        myList.add(st4);
        myList.add(st2);

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

    }

}
