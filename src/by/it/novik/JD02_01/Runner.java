package by.it.novik.JD02_01;




public class Runner {
    public static void main(String[] args) {

        Customer a = new Customer("Sam");
        Customer b = new Customer("Jack");
        Customer c = new Customer("Bob");
        Customer d = new Customer("Kate");

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(c);
        Thread thread4 = new Thread(d);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
