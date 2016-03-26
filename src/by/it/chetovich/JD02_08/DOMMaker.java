package by.it.chetovich.JD02_08;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Map;

/**
 * DOM
 */
public class DOMMaker {

    public static void main(String[] args) {
        String fileName = "file:///"+System.getProperty("user.dir") + "/src/by/it/chetovich/JD02_07/hospital.xml";
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(fileName);
            Element el=doc.getDocumentElement();
            printDom("", el);
        } catch (Exception e) {
            System.out.print("Failed " + e.toString());
        }
    }

    private static void printDom(String prefix, Node node) {
        String text=node.getNodeValue();
        if (text!=null) {
            System.out.println(prefix + text.trim());
        }

        if (node.hasAttributes()) {
            NamedNodeMap map = node.getAttributes();
            System.out.print("(");
            for (int i = 0; i < map.getLength(); i++) {
                Node attr = map.item(i);
                String name = attr.getNodeName();
                String value = attr.getNodeValue();
                System.out.print(name+" = "+value+" ");
            }
            System.out.println(")");
        }
        //else System.out.println();

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            printDom(prefix + node.getNodeName() + " > ", children.item(i));
        }
    }



}
