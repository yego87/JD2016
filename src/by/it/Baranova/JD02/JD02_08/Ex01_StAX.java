package by.it.Baranova.JD02.JD02_08;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

public class Ex01_StAX {
    static String tab="";
    public static void main(String[] args){
        try{
            String filename="src/by/it/Baranova/JD02/JD02_07/Project+xsd.xml";
            FileInputStream inputStream=new FileInputStream(filename);
            XMLInputFactory inputFactory=XMLInputFactory.newInstance();
            XMLStreamReader streamReader=inputFactory.createXMLStreamReader(inputStream);
            String el="";
            while (streamReader.hasNext()) {
                int type = streamReader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String attributes=" ";
                        for (int i=0;i<streamReader.getAttributeCount();i++) {
                            String locName = streamReader.getAttributeLocalName(i);
                            String value=streamReader.getAttributeValue(i);
                            attributes=attributes.concat(locName).concat("=").concat(value).concat(" ");
                        }
                        System.out.println(tab+"["+ streamReader.getLocalName()+attributes+"]");
                        tab=tab+"\t";
                        break;
                    }
                    case XMLStreamConstants.CHARACTERS:
                    {
                        el=el.concat(streamReader.getText()).trim();
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT:
                    {
                        if (!el.isEmpty()){
                            System.out.println(tab+el);
                        }
                        tab=tab.substring(1);
                        el="";
                        System.out.println(tab+"[/"+streamReader.getLocalName()+"]");
                        break;
                    }
                }
            }
        }catch (Exception e){
                System.out.print("Ошибка! " + e.toString());

            }
    }


}
