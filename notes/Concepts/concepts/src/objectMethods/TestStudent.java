package objectMethods;


import java.util.Objects;

class Student{

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public boolean equals(Object o) {
        if(this.getId()== ((Student)o).getId() && this.getName()== ((Student)o).getName())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }

}

class WithoutHash{

    private int id;
    private String name;

    public WithoutHash(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public boolean equals(Object o) {
        if(this.getId()== ((Student)o).getId() && this.getName()== ((Student)o).getName())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class TestStudent {

    public static void main(String[] args){

        long startTime = System.nanoTime();
        long estimatedTime = System.nanoTime() - startTime;

        Student st1 = new Student(201,"John");
        Student st2 = new Student(201,"John");

        System.out.println(st1);
        System.out.println(st1.hashCode()); //with hashcode implementation

        System.out.println("Estimated time with HashCode: "+estimatedTime);

        long startTime1 = System.nanoTime();
        long estimatedTime1 = System.nanoTime() - startTime;

        WithoutHash wst1 = new WithoutHash(201,"John");
        WithoutHash wst2 = new WithoutHash(201,"John");

        System.out.println(wst1);
        System.out.println(wst1.hashCode());

        System.out.println("Estimated time without HashCode: " +estimatedTime1);


    }
}
