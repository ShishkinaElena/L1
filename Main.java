package p1;

public class Main {
    public static final int level = 1; // статическая константа, число пи например

    public static void main(String[] args) {
        People p = new People();
        p.info();
        p.setName("Alex");
        p.setAge(30);
        p.info();

        People p2 = new People("Alex");
        p2.info();

        //People.counter = 8; надо избегать

        People p3 = new People("Alex", 55);
        p3.info();

        People.getCounter();  /* к нему относится public static void getCounter(){
        System.out.println(counter);*/
    }

}
