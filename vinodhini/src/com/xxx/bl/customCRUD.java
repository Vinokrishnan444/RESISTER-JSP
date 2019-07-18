package com.xxx.bl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.xxx.Model.customer;

public class customCRUD {
	public boolean sub(customer c) throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/myjspfile", "sa", "sa");
		PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?)");
		ps.setString(1, c.getName());
		ps.setString(2, c.getEmail_Address());
		ps.setString(3, c.getUser_Password());

		if (ps.executeUpdate() != 0) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
		public ArrayList<customer> SelectAllcustomer() throws ClassNotFoundException, SQLException {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:~/myjspfile","sa","sa");
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery("Select * from customer");
			ArrayList<customer> custlist = new ArrayList<>();
			while(rs.next())
			{
				customer c = new customer();
				c.setName(rs.getString(1));
				c.setEmail_Address(rs.getString(2));
				custlist.add(c);
			}
			return custlist;
		
	}}

















