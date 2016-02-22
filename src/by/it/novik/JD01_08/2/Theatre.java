package by.it.novik.JD01_08;


<<<<<<< HEAD
public class Theatre extends PublicBuilding {

	private String theatreName;
	private String address;
	private int age;
	
	public Theatre(String name) {
		this.theatreName = name;
		System.out.println("'Theatre' name is " + theatreName);
	}
	
	public Theatre(String address, int age) {
		this.address = address;
		this.age = age;
		System.out.println("Its address is " + address + ". Build " + age + " years ago.");
	}

	//overridden ABSTRACT methods from PublicBuilding class
	@Override
public void wardrobe() {
	System.out.println("Taking clothes");
	}

	@Override
public void openDoors() {
	System.out.println("Door opened");	
	}

	@Override
	public void closeDoors(boolean ifOut) {
		System.out.println("Door closed");		
	}


	//overridden method from class PublicBuilding
	public void test(String str, int num) {
		System.out.println("Of Theatre class");
	}


	//own method
	public String showWorkingHours(boolean ifOpen) {
		String workingHours = "It's open between 10 a.m. and 7 p.m.!";
		System.out.println(workingHours);
		return workingHours;
	}

}
=======
public class Theatre extends PublicBuilding implements Building {

    @Override
    public void performance() {

    }


}
>>>>>>> origin/master
