package by.it.daylidovich.JD02_03.Utils;

import java.util.Calendar;

public class CountBuyersInMoment {
    public static int countBuyersInOneMoment(){
        int second =  Calendar.getInstance().get(Calendar.SECOND);
        int countBuyersInOneMoment;
        if (30 > second)
            countBuyersInOneMoment = second / 2;
        else
            countBuyersInOneMoment = (second - 30)/2;
        return countBuyersInOneMoment;
    }
}
