package by.it.predkel.JD0208;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Admin on 26.03.2016.
 */
public class Dom {
    public static void main(String[] args) {//а вот над этим надо подумать
        String fileName = "../JD2016/src/by/it/predkel/FilesXml/Room.xml";
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(fileName);
            Element el=doc.getDocumentElement();
            printDom( el);
        } catch (Exception e) {
            System.out.print("Ошибка! " + e.toString());
        }
    }
    private static void printDom(Node node) {

        NodeList children = node.getChildNodes();



        String text=node.getNodeValue();
        if (text!=null) {
            System.out.println(  text.trim());
        }

        for (int i = 0; i < children.getLength(); i++) {
           // printDom(node.getNodeName() + " > ", children.item(i));
        }
    }
}
