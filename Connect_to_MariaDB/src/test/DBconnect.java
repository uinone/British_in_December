package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// sibal
public class DBconnect {
    String driver = "org.mariadb.jdbc.Driver";
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
 
    public DBconnect() throws ClassNotFoundException, SQLException {
    	
    	Class.forName(driver);
    	con = DriverManager.getConnection(
    			"jdbc:mariadb://localhost/term_project",
    			"dbuser",
    			"sevenmillion");
            
    	if( con != null ) 
    		System.out.println("DB connect Success");
	
}
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        DBconnect dbcon = new DBconnect();
    }
}
