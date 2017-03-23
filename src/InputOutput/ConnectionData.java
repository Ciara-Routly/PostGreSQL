/*
Class name ConnectionData
 */
package InputOutput;

/**
 *
 * @author ciararoutly
 */
public class ConnectionData {
    
    // define member variables
    public static String type;
    
    public static String url;
    
    public static String ipaddress;
    
    public static String port;
    
    // type String
    public static String database;
    
    public static String login;
    
    public static String password;
    
    // method to concatenate url, ipaddress, port, and database
    public String toString(){
        
        return (url + "://" + ipaddress + ":" + port + "/" + database);
        
    }
        
        // Getter method for var type
        public void getType(String type){
        
        this.type = type;
        
    }
        
        public void setType(String type){
            
        this.type = type;
        
        }
        
        // Getter method for var url
        public void getUrl(String url){
          
        this.url = url;
            
    }
        
        public void setUlr(String url){
            
        this.url = url;
            
        }
       
        // Getter method for var ipaddress
        public void getIP(String ipaddress){
          
        this.ipaddress = ipaddress;
            
    }
        public void setIP(String ipaddress){
          
        this.ipaddress = ipaddress;
            
    }
       
        // Getter method for port
        public void getPort(String port){
          
        this.port = port;
            
    }
        
        public void setPort(String port){
          
        this.port = port;
            
    }
        // Getter method for database
        public void getDatabase(String database){
          
        this.database = database;
            
    }
        
         public void setDatabase(String database){
          
        this.database = database;
            
    }
        
        // Getter method for login
        public void getLogin(String login){
          
        this.login = login;
            
    }
        
        public void setLogin(String login){
          
        this.login = login;
            
    }
         
        // Getter method for password
        public void getPassword(String password){
          
        this.password = password;
            
    }
        
        public void setPassword(String password){
          
        this.password = password;
            
    }
}

