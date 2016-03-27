package by.it.predkel.JD0208;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by Admin on 26.03.2016.
 */
public class Sax extends DefaultHandler {//не вижу смысла что-то менять, у вас неплохой код, да и прочитав его, пытаешься сделать то же самое...
    public static void main(String[] args) {
        try {
            String fileName = "../JD2016/src/by/it/predkel/FilesXml/Room.xml";
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            Sax myImplementationSax = new Sax();
            parser.parse(new File(fileName), myImplementationSax);
        } catch (Exception e) {
            System.out.print("Ошибка! " + e.toString());
        }
    }
    private String tab = "";
    private String value;
    @Override
    public void startDocument() throws SAXException {System.out.println("Начало обработки");}
    @Override
    public void endDocument() throws SAXException {System.out.println("Конец обработки");}

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.print(tab + "[" + qName);
        for (int i = 0; i < attributes.getLength(); i++) {
            String name = attributes.getLocalName(i);
            String value = attributes.getValue(i);
            System.out.print(" " + name + "=" + value);
        }
        System.out.println("]");
        tab = '\t' + tab;
        value = "";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (!value.isEmpty())
            System.out.println(tab + value);
        value = "";
        tab = tab.substring(1);
        System.out.println(tab + "[/" + qName + "]");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        value = value.concat(new String(ch, start, length).trim());
    }
}
