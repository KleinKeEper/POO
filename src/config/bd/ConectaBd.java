package config.bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBd {   
    
	private final String url = "jdbc:mysql://bykvhkhrnzmveluf2ig4-mysql.services.clever-cloud.com/bykvhkhrnzmveluf2ig4";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "uldctxfe72qb8zxo";
    private final String password = "k3CeyKmXamscPZg3z3NC";
	
	
	
	public Connection getConnection() throws SQLException{
        Connection cn = null;
        try {
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException 
                | InstantiationException 
                | IllegalAccessException ex) {
       
            throw new SQLException(ex.getMessage());
        }
        return cn;
    }
                                     
}
