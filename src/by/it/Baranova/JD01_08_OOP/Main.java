package by.it.Baranova.JD01_08_OOP;

/**
 * Created by Ekaterina on 2/18/16.
 */
public class Main {

    public static void main(String[] args) {

        DistanceStudent student1 = new DistanceStudent("Баранов", 18, "УЭФ");
        DistanceStudent student2 = new DistanceStudent("Ульянов", 19, "ФФБД", true);
        RegularStudent student3=new RegularStudent("Смирнов",18,"МЭО", true,3);

        /**student2.FamilyName();
        student1.GetAge();
        student2.GetFaculty();
        student2.DocumentsPackage();
        student2.AverageAssessments();
        student3.SetScholarship();**/
        int coursenumber=4;
        try {
            if (coursenumber<1 || coursenumber>5){
                throw new WrongCourseNumberException("Ввeден неверный номера курса");
            }
            int course=student3.SetCourse(coursenumber);
            System.out.println("Номер курса="+course);
        } catch (WrongCourseNumberException e) {
        }


        //student1.SetCourse(3);
        //student3.SetCourse(5);
    }
}
