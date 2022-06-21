package gradingsystem;

import java.util.*;

class Grades{

    String name;
    int maths;
    int science;
    int english;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    Grades(){
    }

    public int totalMarks(int maths, int science, int english){
        int marks;
        marks = maths+science+english;
        return marks;
    }

    public double averageMarks(int maths, int science, int english){
        int avgMarks;
        avgMarks = (maths+science+english)/3;
        return avgMarks;
    }

}

class Student10{

    private String name;

    public String getName() {
        return name;
    }

    Student10(){

    }

    public void setName(String name) {
        this.name = name;
    }

}


public class GradingSystemRevised {

//    public void grades(Grades grades)
//
//    {
//        if (grades.averageMarks() <= 100 && grades.averageMarks() >= 90)
//            System.out.println("You scored A");
//
//        else if(grades.average < 90 && grades.average >= 80)
//            System.out.println("You scored B");
//
//        else if(grades.average < 80 && grades.average >= 70)
//            System.out.println("You scored C");
//        else
//            System.out.println("You Failed!");
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student10 student = new Student10();
        Grades grade = new Grades();

        String userInput;
        int gradeInput;

        System.out.println("Enter your name: ");
        userInput = sc.nextLine();
        //Storing the user input into student name object
        student.setName(userInput);
        System.out.println("Enter English Grade: ");
        gradeInput = sc.nextInt();
        //Storing the user input into grade english object
        grade.setEnglish(gradeInput);
        System.out.println("Enter Maths Grade: ");
        gradeInput = sc.nextInt();
        grade.setMaths(gradeInput);
        System.out.println("Enter Science Grade: ");
        gradeInput = sc.nextInt();
        grade.setScience(gradeInput);
        System.out.println("Total Marks: "+grade.totalMarks(grade.getEnglish(), grade.getMaths(), grade.getScience()));
        System.out.println("Average Grade: "+grade.averageMarks(grade.getEnglish(), grade.getMaths(), grade.getScience()));




    }
}


//        System.out.println("Enter English Grade: "+grade.getEnglish());
//        gradeInput = sc.nextInt();
//        System.out.println("Enter Maths Grade: "+grade.getMaths());
//        gradeInput = sc.nextInt();
//        System.out.println("Enter Science Grade: "+grade.getScience());
//        gradeInput = sc.nextInt();
//        System.out.println("Your Total is: "+grade.totalMarks(grade.getEnglish(), grade.getMaths(), grade.getScience()));
//        System.out.println("Your average is: "+grade.averageMarks(grade.getEnglish(), grade.getMaths(), grade.getScience()));
//



//        List<gradingsystem.Grades> grade = new ArrayList<>();
//
//        grade.add(new gradingsystem.Grades("Rajesh",60,70,80,70));
//        grade.add(new gradingsystem.Grades("John",40,100,10,50));
//        grade.add(new gradingsystem.Grades("Doe",100,80,80,86.67));
//        grade.add(new gradingsystem.Grades("Tom",20,15,42,25.67));

//        System.out.println(grade);
//        // Who scored maximum marks?
//        grade.stream()






//    public void grades(gradingsystem.Grades grades)
//
//    {
//        if (grades.averageMarks() <= 100 && grades.averageMarks() >= 90)
//            System.out.println("You scored A");
//
//        else if(grades.average < 90 && grades.average >= 80)
//            System.out.println("You scored B");
//
//        else if(grades.average < 80 && grades.average >= 70)
//            System.out.println("You scored C");
//        else
//            System.out.println("You Failed!");
//    }