package by.it.Baranova.JD_08_OOP;

/**
 * Created by Ekaterina on 2/18/16.
 */
public class Main {

    public static void main(String[] args) {

        DistanceStudent student1 = new DistanceStudent("Баранов", 18, "УЭФ");
        DistanceStudent student2 = new DistanceStudent("Ульянов", 19, "ФФБД", true);
        RegularStudent student3=new RegularStudent("Смирнов",18,"МЭО", true);

        student2.FamilyName();
        student1.GetAge();
        student2.GetFaculty();
        student2.DocumentsPackage();
        student2.AverageAssessments();
        student3.SetScholarship();

        //Динамический полиморфизм
        student1.SetCourse();
        student3.SetCourse();
    }
}
