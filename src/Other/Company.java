/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import bill.ElecBill;
import static database.ConnectionFactory.conFac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Raghav
 */
public class Company {
    
    private String id;
    private String name;
    private String regOff;
    private String email;
    private String gstNo;

   

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegOff() {
        return regOff;
    }

    public String getEmail() {
        return email;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegOff(String regOff) {
        this.regOff = regOff;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }
    
    public Company searchFromDB(String cid)
    {

        try
        {	
			Connection connect = conFac.getConnection();
			
			
				
				PreparedStatement stmt=connect.prepareStatement("select * from company where compid = ?");
				stmt.setString(1,cid);
                                
                                Company wb2 = new Company();
				
				ResultSet rs =stmt.executeQuery();
				while(rs.next())
				{
					wb2.setId(rs.getString(1));
					wb2.setName(rs.getString(2));
					wb2.setRegOff(rs.getString(3));
                                        wb2.setEmail(rs.getString(4));
                                        wb2.setGstNo(rs.getString(5));
					
					
				}
				rs.close();
				return wb2;
			
        }catch(Exception e){System.out.println(e);}
		
		return null;

    }
    
    public int updateDB(Company wb)
    {
        try
        {	
			Connection connect = conFac.getConnection();
			PreparedStatement stmt=connect.prepareStatement("update company set compname=?,compemail=?,regoff=?,gstno=? where compid=?");
			stmt.setString(1,wb.getName());
			stmt.setString(2,wb.getEmail());
                        stmt.setString(3,wb.getRegOff());
                        stmt.setString(4,wb.getGstNo());
                        stmt.setString(5,wb.getId());
			
			return stmt.executeUpdate();

			
        }catch(Exception e){System.out.println(e);}
		
		return 0;
    }
    
    
    public boolean deleteFromDB(String id)
    {
        try
        {	
			Connection connect = conFac.getConnection();
                     
			
				PreparedStatement stmt=connect.prepareStatement("delete from company where compid = ?");
				stmt.setString(1,id);
			
				return stmt.execute();
			
			
			
        }catch(Exception e){System.out.println(e);}
		
		return false;
    }

    
    
}
