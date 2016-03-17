package by.it.daylidovich.JD02_03.Buyer;

public class CountBuyersInMoment {
    public static int countBuyersInOneMoment(int countSeconds){
        int countBuyersInOneMoment;
        if (1 != countSeconds)
        {
            countBuyersInOneMoment = 2;
        }
        else
            countBuyersInOneMoment = 10;

        return countBuyersInOneMoment;
    }
}