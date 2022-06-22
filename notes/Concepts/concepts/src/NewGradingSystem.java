
import java.util.ArrayList;
import java.util.List;

class Grades{

    private String name;
    private int maths;
    private int science;
    private int english;

    Grades(String name, int maths, int science, int english){
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

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

    public void setScience(int science) {this.science = science;}

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getAverage() {return (maths+science+english)/3;}

    public int getTotalMarks(){
        return maths+science+english;
    }

    @Override
    public String toString() {
        return "Grades { " +
                " name= '" + name + '\'' +
                ", maths = " + maths +
                ", science = " + science +
                ", english = " + english +
                '}';
    }

    public static void main(String[] args) {


        Grades student1 = new Grades("Rajesh",60,70,80);
        Grades student2 = new Grades("John",40,100,10);
        Grades student3 = new Grades("Doe",100,80,80);
        Grades student4 = new Grades("Tom",20,15,42);
        Grades student5 = new Grades("George",100,75,65);

        List<Grades> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        // Average Marks
        studentList.stream()
                .map(Grades::getAverage)
                .forEach(System.out::println);

        // Who scored maximum marks?
        int highest_mark=
                studentList.stream()
                        .map(Grades::getTotalMarks)
                        .max(Integer::compare)
                        .get();
        System.out.println("Highest Mark: "+highest_mark);

        studentList.stream().filter(e->e.getTotalMarks()==highest_mark)
                .forEach(System.out::println);

        // Who scored the min marks?
        int lowest_mark=
                studentList.stream()
                        .map(Grades::getTotalMarks)
                        .min(Integer::compare)
                        .get();
        System.out.println("Lowest Mark: "+lowest_mark);

        studentList.stream().filter(e->e.getTotalMarks()==lowest_mark)
                .forEach(System.out::println);


    }
}

//        public static void printAverageGrades(){
//            {
//                if (getAverage() <= 100 && getAverage() >= 90)
//                    System.out.println("You scored A");
//                else if(getAverage() < 90 && getAverage() >= 80)
//                    System.out.println("You scored B");
//                else if(getAverage() < 80 && getAverage() >= 70)
//                    System.out.println("You scored C");
//                else
//                    System.out.println("You Failed!");
//            }
//        }