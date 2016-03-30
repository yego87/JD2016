package by.it.veselov.JD02_08;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by yegorveselov on 30.03.16.
 */

    public class A_SAX extends DefaultHandler {
        public static void main(String[] args) {

            try {
                String fileName = "src/by/it/veselov/JD02_07/Payment.xml";
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser parser = factory.newSAXParser();
                A_SAX myImplementationSax = new A_SAX();
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



