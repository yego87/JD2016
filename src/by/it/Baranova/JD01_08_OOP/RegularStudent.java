package by.it.Baranova.JD01_08_OOP;

/**
 * Created by Ekaterina on 2/19/16.
 */
public class RegularStudent extends Student {

    public RegularStudent ( String familyName, int age, String faculty, boolean documentsPackage,int coursenumber){
        super.familyName= familyName;
        super.age=age;
        super.faculty=faculty;
        this.documentsPackage=documentsPackage;
        this.coursenumber=coursenumber;

    }
    //Динамический полиморфизм
    @Override
    public int SetCourse(int n) {
        this.coursenumber=n;
        System.out.println("Очное отделение");
        return this.coursenumber;
    }

}
