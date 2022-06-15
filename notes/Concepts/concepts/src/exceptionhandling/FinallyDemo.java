package exceptionhandling;

class FinallyDemo {

    public static void main(String[] args) {
        int i =0;
        String[] greetings ={"Hello Twinkle !", "Hello Java", "Hello World !"};
        System.out.println();
        while(i<4){
            try{
                System.out.println(greetings[i]);
            }catch (ArrayIndexOutOfBoundsException e){ //exception change to array index out of bound
                System.out.println(e.toString()); // message of exception e in String format
                System.out.println("Resetting index value");
            }finally {
                System.out.println(" Hi !");
                i++;
            }
        }
    }
}
