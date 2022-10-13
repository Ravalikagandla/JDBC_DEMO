package com.greatlearning.library.model.jdbc_demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BookDAO booksDao = new BookDAO();
        try {
        
        	
			Connection connection = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","admin");
			java.sql.Statement stmt = connection.createStatement();
        
			int input;
			do {
				System.out.println("Book DAO");
				System.out.println("1. Display");
				System.out.println("2. Insert");
				System.out.println("3. modify");
				System.out.println("4. delete");
				
				Scanner scan = new Scanner(System.in);
				input = scan.nextInt();
				switch (input) {
				
				case 1:
					BookDAO.getAllBooks(stmt);
					break;
				case 2:
					BookDAO.saveData(connection);
					break;
				case 3:
					BookDAO.deleteBook();
					break;
				case 4:
					BookDAO.updateeBook();
					break;
					
					default:
						break;
						
				}
				}
				while(input>0);{
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
