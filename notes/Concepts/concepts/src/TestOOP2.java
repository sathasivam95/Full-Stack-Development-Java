import java.util.Scanner;

class Person{
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void getIntro(){
        System.out.println("Hey this is " + this.name + "I am " + this.age + " years old.");
    }
}

public class TestOOP2 {
    //calculation
        public void canOrCannotVote(Person person)
    {
        if(person.age > 18)
            System.out.println("Yes "+"Mr/Mrs " + person.name + " You can vote!");
        else
            System.out.println("No "+"Mr/Mrs " + person.name + " You cannot vote!");
    }
    public static void main(String[] args){

        TestOOP2 obj = new TestOOP2();
        Person person = new Person(17,"Rajesh");
        obj.canOrCannotVote(person);
    }
}


//Calculation
//    public void canOrCannotVote(int age)
//    {
//        if(age > 18)
//            System.out.println("Yes you can vote");
//        else
//            System.out.println("No you can't vote");
//    }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your age: ");
//        int age = sc.nextInt();
