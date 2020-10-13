package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Lion Kings");
			st.setString(2, "lion@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("21/05/1999").getTime()));
			st.setDouble(4, 2154.00);
			st.setInt(5, 1);
			int rowsAffected = st.executeUpdate();
			
			st.setString(1, "Felipe carrijo");
			st.setString(2, "felipe@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("11/04/2001").getTime()));
			st.setDouble(4, 1240.00);
			st.setInt(5, 2);
			rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done Id = " + id);
				}
			}
			else {
				System.out.println("No rown affected");
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		finally {
			DB.closeStatement(st);
			DB.closeConnection();	
		}
	}
}