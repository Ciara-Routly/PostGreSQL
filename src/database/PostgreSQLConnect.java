/* Class name PostgreSQLConnect */

package database;

import InputOutput.ConnectionData;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ciararoutly
 */
public class PostgreSQLConnect {

    // Set connect to null
    Connection connect = null;
    
    // Constructor with parameter data
    PostgreSQLConnect(ConnectionData data){
     
        // Try catch
        try {
           
            // call class.forName with driver parameter
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection
          ("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "cop3330");
           
        }
        
        // Catch
        catch(Exception e){
            
            // ERROR = print stack trace
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.out.println("Did not open database successfully");
            // Message did not open- exit
            System.exit(0);
            
            
        }
        
        // Passes catch, print open success
        System.out.println("Opened database successfully");
        
        
    }
    
    PostgreSQLConnect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // Method makeConnection returns connect
    public Connection makeConnection(){
        
        return connect;
        
    }
    
    
    
}