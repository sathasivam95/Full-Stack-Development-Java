import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Grades{

    private String name;
    private int maths;
    private int science;
    private int english;
//    private int average;
//    private int totalMarks;

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

    public int getAverage() {
        return (maths+science+english)/3;
    }

//    public void setAverage(int average) {
//        this.average = average;
//    }


    Grades(String name, int maths, int science, int english){
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;

    }
    public int getTotalMarks(){
        return maths+science+english;
    }

    public void printAverageGrades(){
        {
            if (getAverage() <= 100 && getAverage() >= 90)
                System.out.println("You scored A");
            else if(getAverage() < 90 && getAverage() >= 80)
                System.out.println("You scored B");
            else if(getAverage() < 80 && getAverage() >= 70)
                System.out.println("You scored C");
            else
                System.out.println("You Failed!");
        }
    }

    public static void main(String[] args) {

        Grades student1 = new Grades("Rajesh",60,70,80);
        Grades student2 = new Grades("John",40,100,10);
        Grades student3 = new Grades("Doe",100,80,80);
        Grades student4 = new Grades("Tom",20,15,42);
        Grades student5 = new Grades("George",100,75,65);

        List<Grades> students = Arrays.asList(student1,student2,student3,student4,student5);

        // Who scored maximum marks?
        students.stream()
//                .map(Grades::getTotalMarks)
                .max(Comparator.comparing(Grades::getName));









//        grade.stream()
//                .mapToInt(i->i.maths+ i.english+i.science)
//                .forEach(j -> System.out.println(j));
//



//                .map(i -> i.maths+i.science+i.english)
//                .forEach(j -> return {});



//                .max((x,y,z) -> )

//




    }
}

//    public void getStudentInfo(){
//        System.out.println(this.name + " you have scored" + this.maths + " for Math"+ this.science +
//                " for Science"+ this.english + " for English" + this.average + " and this is your average.");
//    }





//        System.out.println("Enter English Grade: "+grade.getEnglish());
//        gradeInput = sc.nextInt();
//        System.out.println("Enter Maths Grade: "+grade.getMaths());
//        gradeInput = sc.nextInt();
//        System.out.println("Enter Science Grade: "+grade.getScience());
//        gradeInput = sc.nextInt();
//        System.out.println("Your Total is: "+grade.totalMarks(grade.getEnglish(), grade.getMaths(), grade.getScience()));
//        System.out.println("Your average is: "+grade.averageMarks(grade.getEnglish(), grade.getMaths(), grade.getScience()));
//





//        List<Grades> grade = new ArrayList<>();
//
//        grade.add(new Grades("Rajesh",60,70,80,70));
//        grade.add(new Grades("John",40,100,10,50));
//        grade.add(new Grades("Doe",100,80,80,86.67));
//        grade.add(new Grades("Tom",20,15,42,25.67));

//        System.out.println(grade);
//        // Who scored maximum marks?
//        grade.stream()





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