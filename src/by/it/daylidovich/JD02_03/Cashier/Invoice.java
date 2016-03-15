package by.it.daylidovich.JD02_03.Cashier;

import by.it.daylidovich.JD02_03.Buyer.Buyer;
import by.it.daylidovich.JD02_03.Goods.Goods;
import by.it.daylidovich.JD02_03.Queue.QueueBuyer;

import java.util.ArrayList;
import java.util.Formatter;

public class Invoice {
    private static Integer proceeds = 0;
    //private final Integer faceProceeds = 0;
    public static StringBuilder createInvoice(Buyer buyer, int countSpace){
        int sum = 0;
        ArrayList<String> backet = buyer.getBacket();
        String spStart = "";
        String spEnd = "      ";
        for (int i = 0; i < countSpace -1; i++) {
            spStart+= "                              ";
        }
        for (int i = 0; i < 5 - countSpace; i++) {
            spEnd+= "                              ";
        }
        StringBuilder invoice = new StringBuilder(spStart + "Чек " + buyer.getName() + "\n");
        for (String goods: backet){
            Formatter f = new Formatter();
            invoice.append(spStart).append(f.format("%-20s %7d\n", goods, Goods.getGoods().get(goods)));
            sum += Goods.getGoods().get(goods);
        }
        proceeds +=sum;
        Formatter f1 = new Formatter();
        Formatter f2 = new Formatter();
        Formatter f3 = new Formatter();
        invoice.append(spStart).append(f1.format("Сумма к оплате:      %7d", sum)).append(spEnd).append(f2.format("%-2d человек(а)", QueueBuyer.lengthQueue())).append(f3.format("   %10d руб.", proceeds));
        return invoice;
    }
}
