package by.it.chetovich.JD02_08;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

/**
 * StAX
 */
public class StAXMaker {

    static String tab="";
    public static void main(String[] args) {

        try {
            String filename = System.getProperty("user.dir")+"/src/by/it/chetovich/JD02_07/hospital.xml";
            FileInputStream input=new FileInputStream(filename);
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLStreamReader reader = inputFactory.createXMLStreamReader(input);
            String el="";
            while (reader.hasNext()) {
                int type=reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT:
                    {
                        System.out.print(tab + "[" + reader.getLocalName());
                        tab=tab+"\t";
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            String name = reader.getAttributeLocalName(i);
                            String value = reader.getAttributeValue(i);
                            System.out.print(" " + name + " = " + value);
                        }
                        System.out.println("]");
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
