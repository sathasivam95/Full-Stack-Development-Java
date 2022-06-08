

public class HelloMyWorld3 {

        // Creating the function
        public static void addition(int a, int b){
            int result = a+b;
            System.out.println(result);
        }
        public static int areaSquare1(int side){
            int result = side * side;
            return result;
        } // For part for further calculation

         public static void areaSquare2(int side){
            int result = side * side;
            System.out.println(result);
        } // If you are not using for further calculation

        public static void main(String[] args){

            // Using/Calling the function
            addition(25,56);
            System.out.println(areaSquare1(5));
            areaSquare2(6);
        }
}

