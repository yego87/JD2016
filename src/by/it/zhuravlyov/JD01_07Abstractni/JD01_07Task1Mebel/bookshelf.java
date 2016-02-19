package by.it.zhuravlyov.JD01_07Abstractni.JD01_07Task1Mebel;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.;

/**
 * Created by user_2 on 19.02.2016.
 */
public class bookshelf {
    public static void main(String[] args) {
        Shelf she1 = new Shelf();

        she1.full();
        Shelf shelf1  = new Shelf("шкаф двухстворчатый");
        Shelf.greet();

        MidiDevice.Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }



    }
}
