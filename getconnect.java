package lib;
import java.sql.*;
import java.sql.DriverManager;

public class getconnect {
	public Connection get() {
	
	String url="jdbc:mysql://localhost/sys";
	String user="root";
	String pass="uniesh2002";
	Connection con=null;
	try {
	con=DriverManager.getConnection(url,user,pass);
	System.out.println("connceted");
	}
	catch (Exception e){
		System.out.println(e);
	}
	return  con;
  }
}
