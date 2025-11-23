package kim;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class insert {
	public Connection  datainsert(String sname ,String sphone) {
		connect obj=new connect();
		Connection con=null;
		try {
			 con=obj.get();
			 System.out.println("Enter book id and book name ");
			 System.out.println();
			PreparedStatement pr=con.prepareStatement("insert into student(name ,phone) values (?,?)");
			pr.setString(1,sname);
			pr.setString(2, sphone);
			pr.execute();
			System.out.println();
			System.out.println("                  Book Returned");
		}
		catch (Exception e){
			System.out.println(e);
		}
		return con;
		}
}
