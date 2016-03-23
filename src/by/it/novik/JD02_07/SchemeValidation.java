package by.it.novik.JD02_07;


import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class SchemeValidation {

    public static void main(String[] args) {

        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "src/by/it/novik/JD02_07/project_connected_DTD.xml";
        String scheme = "src/by/it/novik/JD02_07/scheme.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemeWay = new File(scheme);

        try {
            Schema schema = factory.newSchema(schemeWay);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);
            System.out.println(fileName + " is valid.");
        } catch (SAXException e) {
            System.err.println(fileName.toString() + " failed the validation.");
        } catch (IOException e) {
            System.err.println(fileName.toString() + " not valid.");
        }
    }
}
