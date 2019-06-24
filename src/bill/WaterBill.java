package bill;
import java.util.*;
import database.*;
import static database.ConnectionFactory.conFac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class WaterBill
{
    String billId;
    String customerName;
    String type;
    String customerId;
    String units;
    String amount;
    String status;
    String CompanyID;
    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    

    public void setCompanyID(String CompanyID) {
        this.CompanyID = CompanyID;
    }

    public String getCompanyID() {
        return CompanyID;
    }

    public String getBillId() {
        return billId;
    }

    public String getType() {
        return type;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getUnits() {
        return units;
    }

    public String getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

 
    
    public WaterBill searchFromDB(String billid)
    {

        try
        {	
			Connection connect = conFac.getConnection();
			
			
				
				PreparedStatement stmt=connect.prepareStatement("select * from waterbill where billid = ?");
				stmt.setString(1,billid);
                                
                                WaterBill wb2 = new WaterBill();
				
				ResultSet rs =stmt.executeQuery();
				while(rs.next())
				{
					wb2.setBillId(rs.getString(1));
                                        wb2.setCompanyID(rs.getString(2));
					wb2.setCustomerId(rs.getString(3));
					wb2.setCustomerName(rs.getString(4));
					wb2.setUnits(rs.getString(5));
					wb2.setAmount(rs.getString(6));	
                                        wb2.setDate(rs.getDate(7).toString());
                                        wb2.setStatus(rs.getString(8));
                                        wb2.setType(rs.getString(9));
					
				}
				rs.close();
				return wb2;
			
        }catch(Exception e){System.out.println(e);}
		
		return null;

    }

//public boolean saveToDB(WaterBill wb)
//    {
//        try
//        {
//            Connection connect = conFac.getConnection();
//						
//			PreparedStatement stmt=connect.prepareStatement("insert into bill values(?,?,?,?,?)");
//            stmt.setInt(1,wb.getBillId());
//            stmt.setString(2,wb.getCustomerType());
//			stmt.setInt(3,wb.getCustId());
//			stmt.setInt(4,wb.getUsage());
//			stmt.setDouble(5,wb.getAmount());
//			
//			return stmt.execute();
//			
//        }catch(Exception e){System.out.println(e);}
//		
//		
//		return false;
//
//    }
//	public int updateDB(WaterBill wb)
//    {
//        try
//        {	
//			Connection connect = conFac.getConnection();
//			PreparedStatement stmt=connect.prepareStatement("update bill set cus_type= ?, cus_id = ?, usage = ?, amount = ?  where bill_id = ?");
//			stmt.setString(1,wb.getCustomerType());
//			stmt.setInt(2,wb.getCustId());
//			stmt.setInt(3,wb.getUsage());
//			stmt.setDouble(4,wb.getAmount());
//			stmt.setInt(5,wb.getBillId());
//			
//			return stmt.executeUpdate();
//
//			
//        }catch(Exception e){System.out.println(e);}
//		
//		return 0;
//    }
//	
//	public boolean deleteFromDB(WaterBill wb, int choice)
//    {
//        try
//        {	
//			Connection connect = conFac.getConnection();
//            if(choice==1)
//			{
//				PreparedStatement stmt=connect.prepareStatement("delete from bill where bill_id = ?");
//				stmt.setInt(1,wb.getBillId());
//			
//				return stmt.execute();
//			}
//			else
//			{
//				PreparedStatement stmt=connect.prepareStatement("delete from bill where cus_type= ?");
//				stmt.setString(1,wb.getCustomerType());
//			
//				return stmt.execute();
//			}
//			
//        }catch(Exception e){System.out.println(e);}
//		
//		return false;
//    }
//	
//	public WaterBill searchFromDB(int billId)
//    {
////		ArrayList<WaterBill> arrayList=new ArrayList<WaterBill>();
//        try
//        {	
//			Connection connect = conFac.getConnection();
//			
//			
//				
//				PreparedStatement stmt=connect.prepareStatement("select bill_id,cus_id,cus_type,usage,amount from bill where bill_id = ?");
//				stmt.setInt(1,billId);
//                                
//                                WaterBill wb2 = new WaterBill();
//				
//				ResultSet rs =stmt.executeQuery();
//				while(rs.next())
//				{
//					wb2.setBillId(rs.getInt(1));
//					wb2.setCustomerId(rs.getInt(2));
//					wb2.setCustomerType(rs.getString(3));
//					wb2.setUsage(rs.getInt(4));
//					wb2.setAmount(rs.getDouble(5));					
//				}
//				rs.close();
//				return wb2;
//				
//			
//			/*else if(choice==2)
//			{
//				
//				PreparedStatement stmt=connect.prepareStatement("select bill_id,cus_id,cus_type,usage,amount from bill where cus_type = ?");
//				stmt.setString(1,getCustomerType());
//				
//				ResultSet rs =stmt.executeQuery();
//				
//				while(rs.next())
//				{
//					WaterBill wb2 = new WaterBill();
//					wb2.setBillId(rs.getInt(1));
//					wb2.setCustomerId(rs.getInt(2));
//					wb2.setCustomerType(rs.getString(3));
//					wb2.setUsage(rs.getInt(4));
//					wb2.setAmount(rs.getDouble(5));
//					arrayList.add(wb2);
//				}
//				rs.close();
//				return arrayList;
//			}*/
//        }catch(Exception e){System.out.println(e);}
//		
//		return null;
//
//    }
//	
//	public void printData(int id, int choice)
//    {
//        try
//        {
//			Connection connect = conFac.getConnection();
//			if(choice==1)
//			{
//				
//				PreparedStatement stmt=connect.prepareStatement("select * from bill where bill_id= ?");
//				stmt.setInt(1,id);
//				
//				ResultSet rs =stmt.executeQuery();
//				
//				System.out.println("BILL_ID	  CUS_TYPE	  CUS_ID	USAGE    AMOUNT");
//				System.out.println("");
//				while(rs.next())
//				{
//					System.out.println(rs.getInt("bill_id")+"	  "+rs.getString("cus_type")+"		  "+rs.getInt("cus_id")+"	  	"+rs.getInt("usage")+"	 	"+rs.getInt("amount"));
//				}
//			}
//			else if(choice==2)
//			{
//				PreparedStatement stmt=connect.prepareStatement("select * from bill");
//				
//				ResultSet rs =stmt.executeQuery();
//				
//				System.out.println("BILL_ID 		CUS_TYPE 		CUS_ID		USAGE		AMOUNT");
//				System.out.println("");
//				while(rs.next())
//				{
//					System.out.println(rs.getInt("bill_id")+".		"+rs.getString("cus_type")+"		 "+rs.getInt("cus_id")+"		 "+rs.getInt("usage")+"		 "+rs.getInt("amount"));
//				}
//			}
//			
//			
//        }catch(Exception e){}
//
//    }


}
