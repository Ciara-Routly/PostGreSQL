/*
Class name XmlParser
 */
package InputOutput;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author ciararoutly
 */

public final class XmlParser {

    // Member variables connectionData and document
    ConnectionData connectionData;
    Document document;
    
    // Getter method for connectionData
     public ConnectionData getConnectionData() {
         
        this.connectionData = connectionData;
        return connectionData;
    }
    
     // Void method getter for connectionData
    public void getterConnectionData(ConnectionData connectionData) {
        
        this.connectionData = connectionData;
        
    }

    // Constructor with file to parse as parameter
    public XmlParser(String xmlParsingFile){
        
        parseXmlFile(xmlParsingFile);
        
    }
    
    // Method for parsing file- file to parse is the parameter
    public void parseXmlFile(String xmlParsingFile){
        
        // Instantiate instance of DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        
        // Try catch block start
        try {
           
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            document = db.parse(ClassLoader.getSystemResourceAsStream(xmlParsingFile));
            
            // Instantiate instance of nodeList
            NodeList nodeList = document.getDocumentElement().getChildNodes();
            
            // Loop through length of nodeList
            for(int i = 0; i<nodeList.getLength();i++){
                
                // Instantiate instance of Node
                Node node = nodeList.item(i);
               
                // Conditional statement
                if(node instanceof Element){

                    // Set each var from file 
                    String type = node.getAttributes().getNamedItem("type").getNodeValue();
            
                    String url = "";
            
                    String ipaddress = "";
            
                    int port = 0;
            
                    String database = "";
            
                    String login = "";
            
                    String password = "";

                    NodeList childNodes = node.getChildNodes();

            // Loop through length of child nodes
            for (int j = 0; j < childNodes.getLength(); j++){
           
                Node cNode = childNodes.item(j);
                
                // Condition
                if (cNode instanceof Element){
                    
                    String content = cNode.getLastChild().getTextContent().trim();
                    
                        // Switch statement for each var
                        switch (cNode.getNodeName()){
                        case "url":
                        url = content;
                        break;
                        
                        case "ipaddress":
                        ipaddress = content;
                        break;
                        
                        // Only integer var
                        case "port":
                        port = Integer.parseInt(content);
                        break;
                        
                        case "database":
                        database = content;
                        break;
                        
                        // String vars
                        case "login":
                        login = content;
                        break;
                        
                        case "password":
                        password = content;
                        break;
                    }
                }
            }
         
        }
    }
}
       // Catch for above try block... three catches
       catch(ParserConfigurationException | SAXException | IOException pce) 
        {
            pce.printStackTrace();
        }
      
    }
}
