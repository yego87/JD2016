package by.it.Baranova.JD02.JD02_08;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Ex01_Sax extends DefaultHandler {

    public static void main (String[] args){
        try {
            String filename="src/by/it/Baranova/JD02/JD02_07/Project+xsd.xml";
            SAXParserFactory factory=SAXParserFactory.newInstance();
            SAXParser parser=factory.newSAXParser();
            Ex01_Sax myImplementationSax=new Ex01_Sax();
            parser.parse(new File(filename),myImplementationSax);
        }catch (Exception e){
            System.out.println("Ошибка! "+e.toString());
        }
    }
    private String tab="";
    private String value;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Начало обработки документа");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Окончание обработки документа");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.print(tab+"["+qName);
        for (int i=0;i<attributes.getLength();i++){
            String name=attributes.getLocalName(i);
            String value=attributes.getValue(i);
            System.out.print(" "+name+"="+value);
        }
        System.out.println("]");
        tab="\t"+tab;
        value="";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (!value.isEmpty())
            System.out.println(tab + value);
        value = "";
        tab=tab.substring(1,tab.length());
        System.out.println(tab + "[/" + qName + "]");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        value=value.concat(new String(ch,start,length).trim());
    }


}
