package by.it.veselov.JD02_08;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

/**
 * Created by yegorveselov on 30.03.16.
 */
public class B_StAX {
    static String tab="";
    public static void main(String[] args) {
        try {
            String fileName = "src/by/it/veselov/JD02_07/Payment.xml";
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
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            System.out.println("["+reader.getAttributeName(i)+":"+reader.getAttributeValue(i)+"]");
                        }
                        tab=tab+"\t";
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


