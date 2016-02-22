package by.it.novik.JD01_08;
<<<<<<< HEAD
public abstract class PublicBuilding implements Building {
	
	

	@Override
	public void sellTickets() {
		System.out.println("Your ticket, please");
	}

	@Override
	public int getRevenuePerDay(int numberOfSpectators, int ticketPrice) {
		int revenue = numberOfSpectators * ticketPrice;
		System.out.println(revenue + "$");
		return revenue;
	}

	@Override
	public void printTicket(String nameOfAPlay) {
		System.out.println("Here's your ticket for a play " + nameOfAPlay);
		
	}

	@Override
	public void payToEmployees() {
			System.out.println("All the actors are being payed fairly");		
	}

	@Override
	public String showActorsStuff(String nameOfAPlay) {
		String stuff = "Shia LaBeauf, Geniffer Lopez";
		System.out.println("The play " + nameOfAPlay + " is being presented by " + stuff);
		return stuff;
	}
	public abstract void openDoors(); //own methods
	public abstract void wardrobe();
	
	public abstract void closeDoors(boolean ifOut);


//own method
	public void test(String str) {
		System.out.println("Of PublicBuilding class");
	}
	
}
=======


public abstract class PublicBuilding {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    



}
>>>>>>> origin/master
