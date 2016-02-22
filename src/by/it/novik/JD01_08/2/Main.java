package by.it.novik.JD01_08;
<<<<<<< HEAD
public class Main {

	
	public static void main(String[] args) {
		
		Theatre theatre1 = new Theatre("ТЮЗ");
		
		
		theatre1.wardrobe();
		new Theatre("Lenina street 18", 17);
		theatre1.getRevenuePerDay(59, 18);
		theatre1.printTicket("Romeo and Juliette");
		
		theatre1.showActorsStuff("Hamlet");
		
		theatre1.payToEmployees();
		theatre1.closeDoors(true);



// static polymorphism
		theatre1.test("Вызываем из Public Building");
		theatre1.test("Вызываем из Theatre, нужны 2 параметра", 5);


//dynamic polymorphism
		Theatre theatre2 = new Theatre("Gorky");
		theatre2.showWorkingHours(true);
		Theatre theatre3 = new OperaAndBalletTheatre("Opera and Ballet");
		theatre3.showWorkingHours(true);

		
		

	}

=======


public class Main {
    public static void main(String[] args) {


        Theatre bolshoj = new Theatre();

        bolshoj.setAge(25);
    }
>>>>>>> origin/master
}
