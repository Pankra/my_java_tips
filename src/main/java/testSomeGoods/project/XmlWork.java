package testSomeGoods.project;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by SPankratov on 29.10.2014.
 * source: http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
 */
public class XmlWork {
    public static void main(String[] args) {

        try {
            File sceneXml = new File("C:/project2/task1/example.xml");
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = dBuilder.parse(sceneXml);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            if (doc.hasChildNodes()) {
                printNode(doc.getChildNodes());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printNode(NodeList nodeList) {
        for (int count = 0; count < nodeList.getLength(); count++) {
            Node tempNode = nodeList.item(count);

            // make sure it's element node.
            if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

                // get node name and value
                System.out.println("\nNode Name = " + tempNode.getNodeName() + " [OPEN]");
                System.out.println("Node Value = " + tempNode.getTextContent());

                if (tempNode.hasAttributes()) {

                    // get attributes names and values
                    NamedNodeMap nodeMap = tempNode.getAttributes();

                    for (int i = 0; i < nodeMap.getLength(); i++) {

                        Node node = nodeMap.item(i);
                        System.out.println("attr name : " + node.getNodeName());
                        System.out.println("attr value : " + node.getNodeValue());

                    }

                }

//                if (tempNode.hasChildNodes()) {
//
//                    //loop again if has child nodes
//                    printNote(tempNode.getChildNodes());
//
//                }

                System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

            }
        }
    }

}
