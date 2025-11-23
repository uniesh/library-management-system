package lib;
import java.sql.*;
import java.util.Scanner;
public class del {
	
	Connection con=null;
	getconnect obj=new getconnect();
	
	public Connection del() {
		con=obj.get();
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the book id and book name");	
		System.out.println();
		
		try {
			
		PreparedStatement ps=con.prepareStatement("delete from rep where id=?");
		ps.setInt(1,sc.nextInt());
		System.out.println("Book Issued");
		System.out.println();
		
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
  }
}
