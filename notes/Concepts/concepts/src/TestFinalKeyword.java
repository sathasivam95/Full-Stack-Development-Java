// final keyword --> 1) with class --> no more child, you can inherit final class
// final keyword --> 2) with methods --> it won't allow overriding
// final keyword --> 2) with variables -->  Once you assign final variable, Cannot re-assign.

class Student2 {

    final int id;
    String name;

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void myIntro(){
        System.out.println("Hey this is "+ this.name +" and my id is "+this.id);
    } // cannnot have same name method with final keyword cannot override in parent



}


public class TestFinalKeyword extends Student2{

    public TestFinalKeyword(int id, String name) {
        super(id, name);
    }

    public void myIntro(){
        System.out.println("Hey this is "+ this.name +" and my id is "+this.id);
    }

    public static void main(String[] args){
        Student2 st = new Student2(101,"Rajesh");
        //st.id = 202; Once you assign final variable, Cannot re-assign.
        st.myIntro();

    }

}
