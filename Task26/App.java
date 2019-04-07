package pvt.task25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		String insertInto="INSERT INTO new_table (id, country, numberOfPeople) VALUES ('6','Africa','1000')";
		String selectTabelSql = "SELECT country  FROM new_table WHERE numberOfPeople=1000";
		
		try {
			Connection con=Connection_Manager.connectWithDb();
			Statement st = con.createStatement();
			int rs1=0;
			rs1 = st.executeUpdate(insertInto);
	        ResultSet rs2 = st.executeQuery(selectTabelSql);
	        
			
			
			if (rs2.next()) {
				System.out.println(rs2.getString(1));
				
				}
			
			
			rs2.close();
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}

}
