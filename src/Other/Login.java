/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import database.*;
import static database.ConnectionFactory.conFac;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghav
 */
public class Login extends JPanel {
    
    private String username;
    private String password;
    private String role;
    
    
    
    public Login(){}
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getRole()
    {
        return role;
    }
    
    public void setUsername(String username)
    {
        this.username=username;
    }
    
    public void setPassword(String password)
    {
        this.password=password;
    }
    
    public void setRole(String role)
    {
        this.role=role;
    }
    
    public Login verifyLogin(String username, String password)
    {
        try
        {	
            ConnectionFactory conFac = ConnectionFactory.getInstance();
            Connection connect = conFac.getConnection();
            PreparedStatement stmt;
            
            
                stmt = connect.prepareStatement("select username, password from Login where username = ?");
                stmt.setString(1, username);
                
            

            Login wb2 = new Login();

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                wb2.setUsername(rs.getString(1));
                wb2.setPassword(rs.getString(2));
                wb2.setRole(rs.getString(3));
                
            }
            rs.close();
            return wb2;

            
        } catch (SQLException e) {
            errorBox();
        }

        return null;

    }
    
    public Login searchFromDB(String username)
    {

        try
        {	
			Connection connect = conFac.getConnection();
			
			
				
				PreparedStatement stmt=connect.prepareStatement("select * from Login where username = ?");
				stmt.setString(1,username);
                                
                                Login wb2 = new Login();
				
				ResultSet rs =stmt.executeQuery();
				while(rs.next())
				{
					wb2.setUsername(rs.getString(1));
					wb2.setPassword(rs.getString(2));
					wb2.setRole(rs.getString(3));
					
				}
				rs.close();
				return wb2;
			
        }catch(Exception e){System.out.println(e);}
		
		return null;

    }
    
    public boolean saveToDB(Login wb)
    {
        try
        {
            Connection connect = conFac.getConnection();
						
            PreparedStatement stmt=connect.prepareStatement("insert into login values(?,?,?)");
            stmt.setString(1,wb.getUsername());
            stmt.setString(2,wb.getPassword());
            stmt.setString(3,wb.getRole());
	
            return stmt.execute();
			
        }catch(Exception e){System.out.println(e);}
		
		
		return false;

    }

    
    private static void errorBox() {
        //To change body of generated methods, choose Tools | Templates.
        
        JOptionPane.showMessageDialog(null,"Username And Password does not exist !!");
        
    }
}
