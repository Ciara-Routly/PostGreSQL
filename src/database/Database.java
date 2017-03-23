/*
Class name Database
 */
package database;

import InputOutput.ConnectionData;
import InputOutput.XmlParser;

/**
 *
 * @author ciararoutly
 */
public class Database {


    public static void main(String[] args) {
        
        // Create instance of class XmlParser
        XmlParser parser = new XmlParser("inputOutput/properties.xml");
        
        ConnectionData data = parser.getConnectionData();
   
        PostgreSQLConnect connect = new PostgreSQLConnect(data);
     
        // Call method makeConnection with connect instance 
        connect.makeConnection();
    }


}
