package lib;
import java.sql.*;
public class show {
	Connection con=null;
	getconnect obj=new getconnect();
	
	public Connection show(){
		con=obj.get();
		try {
			System.out.println();
			PreparedStatement ps=con.prepareStatement("select * from rep");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			System.out.println();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		}
}
