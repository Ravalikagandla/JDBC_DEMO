package com.greatlearning.library.model.jdbc_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookDAO {

	public void getAllBooks(Statement stmt) throws Exception{
		String str = "select title, price,qty from books";
		ResultSet rs = stmt.executeQuery(str);
		int rowCounter=0;
		while (rs.next()) {
			String title = rs.getString("title");
			double price = rs.getDouble("price");
			int qty = rs.getInt("qty");
			
			System.out.println("The Data =");
			System.out.println("title = "+title);
			System.out.println("price = "+price);
			System.out.println("Qty "+qty);
			++rowCounter;
	
		}
		public void saveData(Connection conn)throws Exception {
    String str = "insert into books(id,title,author)values(?,?,?)";
    PreparedStatement psts = conn.preapreStatement(str);
    psts.setInt(1, 5006);
    psts.setString(2, "Raman");
    psts.setString(3,  "Raman");
    int row = psts.executeUpdate();
    
    
		}
	public void deletebook(Statement stmt) {
		String sql = "delete from books where id >=3000 and id < 4000";
		int counter = stmt.executeUpdate(sql);
		System.out.println("the Delete recorded:- "+counter);
		
	}
		public void updateBook(Statement stmt)throws Exeception {
 String sql = "update books set price = price*1.07 where id = 1001";
 int counter = stmt.executeupdate(sql);
 System.err.printIn(counter);
 
		}
	}
}

