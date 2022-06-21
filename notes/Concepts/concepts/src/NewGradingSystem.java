import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Grades{

    String name;
    int maths;
    int science;
    int english;
    double average;

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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    Grades(String name, int maths, int science, int english,double average){
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.average = average;
    }
}

public class NewGradingSystem {

    public void grades(Grades grades)

    {
        if (grades.average <= 100 && grades.average >= 90)
            System.out.println("You scored A");

        else if(grades.average < 90 && grades.average >= 80)
            System.out.println("You scored B");

        else if(grades.average < 80 && grades.average >= 70)
            System.out.println("You scored C");
        else
            System.out.println("You Failed!");
    }

    public static void main(String[] args) {

        NewGradingSystem obj = new NewGradingSystem();
        List<Grades> grade = new ArrayList<>();

        grade.add(new Grades("Rajesh",60,70,80,70));
        grade.add(new Grades("John",40,100,10,50));
        grade.add(new Grades("Doe",100,80,80,86.67));
        grade.add(new Grades("Tom",20,15,42,25.67));

        System.out.println(grade);
        // Who scored maximum marks?
        grade.stream()
                .map(i -> i.maths+i.science+i.english)
                .forEach(j -> System.out.println(j));
//                .max((x,y,z) -> )

//







    }
}

//    public void getStudentInfo(){
//        System.out.println(this.name + " you have scored" + this.maths + " for Math"+ this.science +
//                " for Science"+ this.english + " for English" + this.average + " and this is your average.");
//    }
