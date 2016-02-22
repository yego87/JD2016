package by.it.novik.JD01_08;


public class OperaAndBalletTheatre extends Theatre{
//constructors of 'Theatre' class --------
    public OperaAndBalletTheatre(String name) {
        super(name);
    }

    public OperaAndBalletTheatre(String address, int age) {
        super(address, age);
    }

    @Override
    public String showWorkingHours(boolean ifOpen) {
        String whenCloses = "Theatre closes at 7 p.m.";
        System.out.println(whenCloses);
        return whenCloses;
    }
}
