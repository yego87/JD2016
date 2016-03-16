package by.it.novik.JD02_01;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor= Executors.newFixedThreadPool(5);
        executor.execute(new Cashier());
        executor.execute(new Cashier());




        while (!(Customer.customersNum>=Cashier.planNumOfCustomers)) {
            Customer.think();
            for(int i = 0; i <= 2; i++) {
                new Customer(getRandomName());
                if(Customer.customersNum>=Cashier.planNumOfCustomers){
                    break;
                }
            }
        }
        executor.shutdown();

//        int people = 0;
//
//        Random random = new Random();
//
//        Queue<Customer> queue=new ArrayDeque<>();
//        while (people++ < 6) {
//            Thread.sleep(random.nextInt(500));
//
//            Customer customer = new Customer(getRandomName());
//            queue.add(customer);
//        }
    }

    public static String getRandomName() {
        String name = "";

        String[] names = {"Sam", "Jack", "Bob", "Kate", "Andrew","Dominique",};
        String[] surnames = {"Peterson", "Jackson", "Cox", "Lincoln", "Shepperd", "Bowie"};

        Random random = new Random();

        name += names[random.nextInt(names.length - 1)];
        name += " ";
        name += surnames[random.nextInt(surnames.length - 1)];

        return name;
    }
}
