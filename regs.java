package lib;
import java.sql.*;
import java.util.*;
public class regs {
	getconnect boj=new getconnect();
	Connection con=null;
	public Connection regs() {
		con=boj.get();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your usernme and password");
		System.out.println();
		try {
			PreparedStatement ps=con.prepareStatement("insert login values(?,?)");
		    ps.setString(1,sc.next());
		    ps.setString(2,sc.next());
		    ps.execute();
		    System.out.println("       REGISTRED");
		    System.out.println();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
