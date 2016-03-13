package by.it.novik.JD02_01;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        int people = 0;

        Random random = new Random();

        Queue<Customer> queue=new ArrayDeque<>();
        while (people++ < 6) {
            Thread.sleep(random.nextInt(500));

            Customer customer = new Customer(getRandomName());
            queue.add(customer);
        }
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
