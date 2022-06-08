
public class TestString1 {

    public static void main(String[] args){
        //String --> collection of chars --> " "/ a class in java not primitive

        String name = "Rajesh";

        System.out.println(name);
        System.out.println(name.equals("rajesh"));
        System.out.println(name.substring(3));
        System.out.println(name.charAt(2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2,5));
        System.out.println(name.length());
        System.out.println(name.concat("Sharma")); //putting it together name + inside concat
        System.out.println(name.contains("h"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.lastIndexOf("e")); // last of the repeated str
        System.out.println(name.replace("e","i"));

        String record = "101,Tim,12345678,New York,USA";

        String[] data = record.split(",");

        for(String d:data){
            System.out.println(data);
        }
    }
}
