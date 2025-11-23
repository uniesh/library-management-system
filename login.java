package lib;
import java.sql.*;
import java.util.*;
public class login {
	getconnect obj=new getconnect();
	Connection con=null;
	public Connection login() {
		con=obj.get();
		System.out.println("Enter your username and pass word");
		Scanner sc=new Scanner(System.in);
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE name = ? AND pass = ?");
			ps.setString(1, sc.next());
			ps.setString(2, sc.next());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
			    System.out.println("Login successful!");
			    System.out.println();
			    while(true) {
			    System.out.println("1)Show repository\n2)Issue Book\n3)Return\n4)Exit");
			    System.out.println();
			    int reg=sc.nextInt();
            
		      		  if (reg==1) {
		  	        	  show obj1=new show();
		  	        	  obj1.show();
		  	        	  
		  	          }
		  	          else if(reg==2) {
		  	        	  del obj1=new del();
		  	        	  obj1.del();
		  	        	
		  	          }
		  	          else if (reg==3) {
		  	        	  ins obj1=new ins();
		  	        	  obj1.ins();
		  	        	
		  	          }
		  	          else if(reg==4) {
		  	        	  System.out.println("\t\t \t\t\tTHNAK YOU");
		  	        	System.out.println();
		  	        	  break;
		  	        	  
		  	          }
		  	          else {
		  	        	  System.out.println("Plese check the number");
		  	        	System.out.println();
		  	        	
		  	          }
					    }
		  	          
		  	        }
		      	  
		      	  else {
					    System.out.println("Invalid username or password.");
					    System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
