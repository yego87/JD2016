package by.it.predkel.MatLab.Utils;

import by.it.predkel.MatLab.Var;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

/**
 * Created by Admin on 23.03.2016.
 */
public class TextBuilder extends Builder{
    @Override
    public void createHeader() {
        text.append("Начало отчета");
        text.append("\n");
    }

    @Override
    public void createTime() {
        GregorianCalendar time = new GregorianCalendar();
        time.setTimeInMillis(System.currentTimeMillis());
        text.append(time.get(time.HOUR_OF_DAY)+":"+time.get(time.MINUTE)+":"+time.get(time.SECOND)+" "+time.get(time.DATE)+"-"+(time.get(time.MONTH)+1)+"-"+time.get(time.YEAR)+"   "+"\n");
    }

    @Override
    public void createOperation(String operation) {
        text.append("Операция: "+operation+"\n");
    }

    @Override
    public void createResult(String operation) {
        text.append("Результат: "+operation+"\n");
    }

    @Override
    public void getText() throws IOException {
        BufferedWriter f;
        f = new BufferedWriter(new FileWriter("../JD2016/src/by/it/predkel/MatLab/builder.txt",true));
        f.write(String.valueOf(text));
        f.flush();
    }

}
