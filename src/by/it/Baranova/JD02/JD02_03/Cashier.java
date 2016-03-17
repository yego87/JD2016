package by.it.Baranova.JD02.JD02_03;

import java.util.HashMap;
import java.util.Map;

public class Cashier extends Thread {

    int num;
    Buyer buyer;
    public int getNum() {
        return num;
    }

    private static Integer overAllTotal=0;
    private Integer queueSize;
    public final static Integer flag=0;

    public Cashier(int num){
        this.num=++Dispatcher.countCashiers;
        this.setName ("Cashier № "+num);
    }

    @Override
    public void run() {
        String s = "Opened";
        if (this.getNum() == 1) {
            System.out.printf("%54s ", s);
            System.out.println();
        }
        if (this.getNum() == 2) {
            System.out.printf("%74s ", s);
            System.out.println();
        }
        if (this.getNum() == 3) {
            System.out.printf("%94s ", s);
            System.out.println();
        }
        if (this.getNum() == 4) {
            System.out.printf("%114s ", s);
            System.out.println();
        }
        if (this.getNum() == 5) {
            System.out.printf("%134s ", s);
            System.out.println();
        }
        while (!Dispatcher.finish()) {
            synchronized (flag) {
                this.queueSize = QueueToCashier.queueToCashier.size();
                this.buyer = QueueToCashier.queueToCashier.poll();
            }
            if (!Dispatcher.finish() && this.buyer != null) {
                int pause = Rnd.fromTo(2000, 5000);
                Dispatcher.sleep(pause);
                takeBuyerFromQueue();
                takeItemsFromBacket();
                serviceBuyer();
                letBuyerGo();
            } else {
                Dispatcher.sleep(1000);
            }

        }
        s = "Closed";
        if (this.getNum() == 1) {
            System.out.printf("%54s ", s);
            System.out.println();
        }
        if (this.getNum() == 2) {
            System.out.printf("%74s ", s);
            System.out.println();
        }
        if (this.getNum() == 3) {
            System.out.printf("%94s ", s);
            System.out.println();
        }
        if (this.getNum() == 4) {
            System.out.printf("%114s ", s);
            System.out.println();
        }
        if (this.getNum() == 5) {
            System.out.printf("%134s ", s);
            System.out.println();
        }

    }

    public void takeBuyerFromQueue () {
            String s = "service Buyer №" + this.buyer.getNum();

            if (this.getNum() == 1) {
                System.out.printf("%54s %102s ", s,this.queueSize);
            }
            if (this.getNum() == 2) {
                System.out.printf("%74s %82s ", s,this.queueSize);
            }
            if (this.getNum() == 3) {
                System.out.printf("%94s %62s ", s,this.queueSize);
            }
            if (this.getNum() == 4) {
                System.out.printf("%114s %42s ", s,this.queueSize);
            }
            if (this.getNum() == 5) {
                System.out.printf("%134s %22s ", s,this.queueSize);
            }
            System.out.println();
    }


    public void takeItemsFromBacket(){
        String s="take the goods from the backet of Buyer №" + this.buyer.getNum();
        if (this.getNum()==1){System.out.printf("%54s ",s);}
        if (this.getNum()==2){System.out.printf("%74s ",s);}
        if (this.getNum()==3){System.out.printf("%94s ",s);}
        if (this.getNum()==4){System.out.printf("%114s ",s);}
        if (this.getNum()==5){System.out.printf("%134s ",s);}
        System.out.println();
    }

    public void  serviceBuyer() {
        synchronized (flag) {
            HashMap<String, Integer> checkbacket = this.buyer.backet.getProductsMap();
            String check = "count Buyer №" + this.buyer.getNum()+"\n";
            check = check + "-------Check of buyer №" + this.buyer.getNum() + "-------\n";
            Integer summ = 0;
            for (Map.Entry<String, Integer> pair : checkbacket.entrySet()) {
                check = check + "    " + pair.getKey() + " " + pair.getValue() + "\n";
                summ = summ + pair.getValue();
            }
            check = check + "-------TOTAL:" + summ + "--------------\n";
            overAllTotal = overAllTotal + summ;
            System.out.print(check);
            String over=overAllTotal.toString();
            System.out.printf("%171s ", over);
            System.out.println();
        }
    }

    public void letBuyerGo(){
        synchronized (this.buyer) {
            String s="let Buyer №" + this.buyer.getNum() + " go";
            if (this.getNum()==1){System.out.printf("%54s ",s);}
            if (this.getNum()==2){System.out.printf("%74s ",s);}
            if (this.getNum()==3){System.out.printf("%94s ",s);}
            if (this.getNum()==4){System.out.printf("%114s ",s);}
            if (this.getNum()==5){System.out.printf("%134s ",s);}
            System.out.println();
            Dispatcher.countCompleteBuyers++;
            this.buyer.iWait=false;
            this.buyer.notify();
        }
    }

    @Override
    public String toString(){
        return this.getName();
    }

}
