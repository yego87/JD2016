package by.it.chetovich.JD02_08;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import by.it.chetovich.*;

/**
 * SAX
 */
public class SAXMaker extends DefaultHandler {

    public static void main(String[] args) {

        try{
            String filename = System.getProperty("user.dir")+"/src/by/it/chetovich/JD02_07/hospital.xml";
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SAXMaker mySAX = new SAXMaker();
            parser.parse(new File(filename), mySAX);
        } catch (Exception e){
            System.out.println("Failed "+e.getMessage());
        }

    }

    private String tab = "";
    private String value;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing.");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End parsing.");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.print(tab+"["+qName);
        for (int i = 0; i < attributes.getLength(); i++) {
            String name = attributes.getLocalName(i);
            String value = attributes.getValue(i);
            System.out.print(" "+name+" = "+value);
        }
        System.out.println("]");
        tab = '\t'+tab;
        value = "";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (!value.isEmpty())
            System.out.println(tab+value);
        value = "";
        tab = tab.substring(1);
        System.out.println(tab+"/["+qName+"]");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        value +=new String (ch,start,length);
    }
}
