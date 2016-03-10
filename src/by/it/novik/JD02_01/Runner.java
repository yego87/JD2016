package by.it.novik.JD02_01;




public class Runner {
    public static void main(String[] args) {
        Prices priceList = new Prices();

        Customer a = new Customer("Sam", priceList);
        Customer b = new Customer("Jack", priceList);
        Customer c = new Customer("Bob", priceList);
        Customer d = new Customer("Kate", priceList);

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);

        thread1.start();
        thread2.start();
    }
}
