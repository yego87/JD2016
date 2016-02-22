package by.it.Baranova.JD_08_OOP;


/**
 * Created by Ekaterina on 2/18/16.
 */
public abstract class Student implements Applicant {
    public int age;
    public boolean documentsPackage;
    public int [] assessments;
    public String faculty;
    public String familyName;
    public int scholarship;
    public int averageAssessments;
    public int coursenumber;


    @Override
    public int GetAge() {
        System.out.println("Метод возвращает возраст студента");
        return age;
    }

    @Override
    public String GetFaculty () {
        System.out.println("Метод возвращает факультет, на который зачислен студент");
        return faculty;
    }

    @Override
    public String FamilyName() {
        System.out.println("Метод возвращает фамилию студента");
        return familyName;
    }

    @Override
    public boolean DocumentsPackage() {
        System.out.println("Метод проверяет, полный ли пакет документов студента предоставлен");
        return true;
    }

    @Override
    public double AverageAssessments() {
        System.out.println("Метод считает среднюю оценку студента");
        return averageAssessments;
    }

    @Override
    public int SetScholarship() {
        System.out.println("Метод устанавливает стипендию");
        return scholarship;
    }


    @Override
    public int SetCourse() {
        System.out.println("Метод устанавливает курс, на котором учится студент");
        return coursenumber;
    }
}
