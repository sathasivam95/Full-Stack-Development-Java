//package java8Features;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//// Java 8 Features
//// 1) Lambda Expression --> implementation of functional interface
//// functional interface --> interface with exactly one method to implement (e.g., comparator)
//// 2) Stream API -->
//
//class Student5 {
//
//        private int id;
//        private String name;
//
//        public Student5(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "Student6{" +
//                    "name='" + name + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this.getId() == ((mycollection.Student5)o).getId()){
//                return true;
//            }else {
//                return false;
//            }
//        }
//
//        //for better search performance
//        @Override
//        public int hashCode() {
//            return 5;
//        }
//
//    }
//
//class MyStudentComparator implements Comparator<Student5>{
//
//    public int compare(Student5 o1, Student5 o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
//
//
//public class TestJava8Features {
//
//    public static void main(String[] args) {
//            Student5 st1 = new Student5(101, "Rajesh");
//            Student5 st2 = new Student5(102, "Tom");
//            Student5 st3 = new Student5(103, "John");
//            Student5 st4 = new Student5(104, "Harry");
//
//            ArrayList<Student5> mylist = new ArrayList<>();
//
//            mylist.add(st1);
//            mylist.add(st3);
//            mylist.add(st4);
//            mylist.add(st2);
//
//            System.out.println(mylist);
//
//            //Lamda syntax () --> {}
//            Collections.sort(mylist, (Student5 o1, Student5 o2)->{return o1.getName().compareTo(o2.getName());});
//
//            System.out.println(mylist);
//
//        }
//    }
//    }
