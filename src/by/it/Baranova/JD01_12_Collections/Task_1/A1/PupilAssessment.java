package by.it.Baranova.JD01_12_Collections.Task_1.A1;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 2/27/16.
 */
public class PupilAssessment {
    public static ArrayList<ArrayList<Integer>> FillingPupilArray(){
        ArrayList<ArrayList<Integer>> pupil=new ArrayList<ArrayList<Integer>>(15);
        for (int i=0;i<15;i++) {
            ArrayList<Integer> assessments=new ArrayList<>(15);
            for (int j = 0; j < 15; j++) {
                assessments.add((int) (Math.random() * 10));
            }
            pupil.add(assessments);
        }
        System.out.print("Все оценки учеников  ");
        System.out.print(pupil);
        System.out.println();
        return pupil;
    }

    public static void FillingGoodAssessment(ArrayList<ArrayList <Integer>> pupil ){
        System.out.print("Хорошие оценки ученика  ");
        ArrayList <ArrayList<Integer>> pupilGood=new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<15;i++) {
            ArrayList<Integer> goodAssessments = new ArrayList<>(15);
            for (int j = 0; j < 15; j++) {
                if (pupil.get(i).get(j) > 4) goodAssessments.add(pupil.get(i).get(j));
            }
            pupilGood.add(goodAssessments);
        }
        System.out.println(pupilGood);
    }
}
