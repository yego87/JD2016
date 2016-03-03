package by.it.Baranova.JD01_08_OOP;

/**
 * Created by Ekaterina on 2/19/16.
 */
public class RegularStudent extends Student {

    public RegularStudent ( String familyName, int age, String faculty, boolean documentsPackage){
        super.familyName= familyName;
        super.age=age;
        super.faculty=faculty;
        this.documentsPackage=documentsPackage;

    }
//Динамический полиморфизм
    @Override
    public int SetCourse() {
        super.SetCourse();
        System.out.println("Очное отделение");
        return super.coursenumber;

    }

}
