/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Raghav
 */
public class ConnectionFactory
{
	private ConnectionFactory(){}
	public static ConnectionFactory conFac= new ConnectionFactory();
	
	public static ConnectionFactory getInstance()
	{
		return conFac;
	}
	
	public static Connection getConnection()
	{
		try
		{
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment","root","raghavcool");
			return connect;
			
		}catch(Exception e){ System.out.println(e);}
		
		return null;
		
		
	}
	
	public void DBLoadDriver()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(Exception e){ System.out.println(e);}
        }
}