package by.it.Baranova.JD02.JD02_08;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Map;

/**
 * Created by Ex01_DOM on 3/27/16.
 */
public class Ex01_DOM {
    public static void main(String[] args) {
        String filename = "src/by/it/Baranova/JD02/JD02_07/Project+xsd.xml";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(filename);
            Element el = document.getDocumentElement();
            printDOM("", el);
        } catch (Exception e) {
            System.out.print("Ошибка! " + e.toString());
        }
    }


    public static void printDOM(String prefix, Node node) {
        String text=node.getNodeValue();
        if (text!=null){
            System.out.println(prefix + text.trim());
        }
        NodeList children=node.getChildNodes();
        for (int i=0;i<children.getLength();i++){
           String attrib="";
            if (children.item(i).hasAttributes()){
                NamedNodeMap attributesMap=children.item(i).getAttributes();
                for (int j=0;j<attributesMap.getLength();j++){
                    attrib=attrib.concat(" ").concat(attributesMap.item(j).getNodeName());
                    attrib=attrib.concat("=").concat(attributesMap.item(j).getNodeValue());
                }
            }
            printDOM(prefix+node.getNodeName()+attrib+">", children.item(i));

        }
    }
}