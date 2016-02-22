package by.it.novik.JD01_08;

public interface Building {
	
   void sellTickets();                            
   int getRevenuePerDay(int numberOfSpectators, int ticketPrice);   
   void printTicket(String nameOfAPlay);         
   void payToEmployees();
   String showActorsStuff(String nameOfAPlay);
}
