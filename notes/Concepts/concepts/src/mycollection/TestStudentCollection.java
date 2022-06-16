package mycollection;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Student3{

    private int id;
    private String name;

    public Student3(int id, String name) {
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
        Student3 student3 = (Student3) o;
        return id == student3.id && Objects.equals(name, student3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student3 {" +
                " name= '" + name + '\'' +
                '}';
    }
}


public class TestStudentCollection {

    public static void main(String[] args) {
        Student3 st1 = new Student3(101, "Rajesh");
        Student3 st2 = new Student3(102, "Tom");
        Student3 st3 = new Student3(102, "Tom");
        Student3 st4 = new Student3(104, "Harry");

        //Set<Student3> myset = new LinkedHashSet<>(); // general purpose unordered, unsorted, takes only unique item
        Set<Student3> myset = new TreeSet<>(); //unqiue as well as sorted based on logic given in comparable

        myset.add(st1);
        myset.add(st2);
        myset.add(st4);
        myset.add(st3);

        System.out.println(myset);
    }

}
