package by.it.Baranova.JD01_08_OOP;

/**
 * Created by Ekaterina on 2/18/16.
 */
public class DistanceStudent extends Student {

    //Статический полиморфизм
    public DistanceStudent ( String familyName,int age,String faculty){
        super.familyName= familyName;
        super.age=age;
        this.faculty=faculty;
    }

    public DistanceStudent ( String familyName,int age,String faculty, boolean documentsPackage){
        super.familyName= familyName;
        super.age=age;
        super.faculty=faculty;
        this.documentsPackage=documentsPackage;

    }

    //Динамический полиморфизм
    @Override
    public int SetCourse() {
        super.SetCourse();
        System.out.println("Заочное отделение");
        return super.coursenumber;

    }

}
