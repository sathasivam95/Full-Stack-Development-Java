interface Animal{

    void eats();
    void travels();
}

class Mammallnt implements Animal {

    public void eats() {
        System.out.println("Mammal eats");
    }

    public void travels() {
        System.out.println("Mammal travels");
    }

    public static void main(String[] args) {

        Mammallnt obj = new Mammallnt();

        obj.eats();
        obj.travels();
    }

}
