package by.it.veselov.JD02_08;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by yegorveselov on 30.03.16.
 */
public class C_DOM {
    public static void main(String[] args) {
        String fileName = "src/by/it/veselov/JD02_07/Payment.xml";
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(fileName);
            Element el=doc.getDocumentElement();
            printDom("", el);
        } catch (Exception e) {
            System.out.print("Ошибка! " + e.toString());
        }
    }
    private static void printDom(String prefix, Node node) {
        String text=node.getNodeValue();
        if (text!=null) {
            System.out.println(prefix + text.trim());
            System.out.println();
        }
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            printDom(prefix+node.getNodeName() + " > ", children.item(i));
            org.w3c.dom.NamedNodeMap attrNode = node.getAttributes();
            if(node.getAttributes().getLength()>0)
            for (int j = 0; j < attrNode.getLength(); j++) {
                Node attr = attrNode.item(j);
                System.out.println(attr.getNodeName()+":"+attr.getNodeValue());
            }
        }
    }



}

