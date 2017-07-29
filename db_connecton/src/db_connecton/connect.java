package db_connecton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
			Statement S=con.createStatement();	
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM Asda");
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			
		}
		catch (Exception ex) {
			System.out.println(ex);
        // handle the error
		}
	}

}
