package by.it.Baranova.JD01_12_Collections.Task_1.A1;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //Задание про оценки студента
        ArrayList<ArrayList<Integer>> pupil= PupilAssessment.FillingPupilArray();
        PupilAssessment.FillingGoodAssessment(pupil);
    }
}
