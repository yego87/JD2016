package by.it.predkel.JD0208;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

/**
 * Created by Admin on 26.03.2016.
 */
public class Stax {
    static String tab="";
    public static void main(String[] args) {//почти аналогичная ситуация с Sax-ом только надо было добавить атрибуты...
        try {
            String fileName = "../JD2016/src/by/it/predkel/FilesXml/Room.xml";
            FileInputStream input=new FileInputStream(fileName);
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLStreamReader reader = inputFactory.createXMLStreamReader(input);

            String el="";
            while (reader.hasNext()) {
                int type=reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT:
                    {
                        System.out.println(tab+"[" + reader.getLocalName() + "]");
                        tab=tab+"\t";
                        for(int i = 0, n = reader.getAttributeCount(); i < n; ++i)
                            System.out.println("Аттрибут: [" + reader.getAttributeName(i)+ "=" + reader.getAttributeValue(i)+"]");
                        break;
                    }
                    case XMLStreamConstants.CHARACTERS:
                    {
                        el=el.concat(reader.getText().trim());
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT:
                    {
                        if (!el.isEmpty())
                            System.out.println(tab+el);
                        tab=tab.substring(1);
                        el="";
                        System.out.println(tab+"[/" + reader.getLocalName() + "]");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("Ошибка! " + e.toString());
        }
    }
}
