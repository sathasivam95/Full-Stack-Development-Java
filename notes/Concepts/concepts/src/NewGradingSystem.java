

class Grades{

    String name;
    int maths;
    int science;
    int english;
    double average;

    Grades(String name, int maths, int science, int english,double average){
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.average = average;
    }


//    public void getStudentInfo(){
//        System.out.println(this.name + " you have scored" + this.maths + " for Math"+ this.science +
//                " for Science"+ this.english + " for English" + this.average + " and this is your average.");
//    }

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


        Grades student = new Grades("Rajesh",60,70,80,70);
        Grades student1 = new Grades("John",40,100,10,50);
        Grades student2 = new Grades("Doe",100,80,80,86.67);
        Grades student3 = new Grades("Tom",20,15,42,25.67);

        obj.grades(student);
        obj.grades(student1);
        obj.grades(student2);
        obj.grades(student3);

    }
}
