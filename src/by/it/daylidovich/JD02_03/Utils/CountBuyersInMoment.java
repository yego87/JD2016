package by.it.daylidovich.JD02_03.Utils;

public class CountBuyersInMoment {
    public static int countBuyersInOneMoment(int countSeconds){
        int countBuyersInOneMoment;
        if (1 != countSeconds)
        {
            countBuyersInOneMoment = 3;
        }
        else
            countBuyersInOneMoment = 10;

        return countBuyersInOneMoment;
    }
}