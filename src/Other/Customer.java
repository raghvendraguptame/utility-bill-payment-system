
package Other;
import database.ConnectionFactory;
import static database.ConnectionFactory.conFac;
import java.sql.*;

public class Customer 
{
        String id,name,email,address,phn,password,question,answer;
	

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
        
	public void setID(String id)
	{
		this.id=id;
	}
	public String getID()
	{
		return this.id;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return this.email;
	}

	public void setPhn(String phn)
	{
		this.phn=phn;
	}
	public String getPhn()
	{
		return this.phn;
	}

	public void setAddr(String address)
	{
		this.address=address;
	}
	public String getAddr()
	{
		return this.address;
	}
        
        public void setPassword(String password)
        {
            this.password= password;
        }
        
        public String getPassword()
        {
            return password;
        }
        
        
        public int updateDB(Customer wb)
    {
        try
        {	
			Connection connect = conFac.getConnection();
			PreparedStatement stmt=connect.prepareStatement("update cus set name=?,email=?,phn=?,addr=?,password=? where cus_id=?");
			stmt.setString(1,wb.getName());
			stmt.setString(2,wb.getEmail());
                        stmt.setString(3,wb.getPhn());
                        stmt.setString(4,wb.getAddr());
                        stmt.setString(5,wb.getPassword());
                        stmt.setString(6,wb.getID());
			
			return stmt.executeUpdate();

			
        }catch(Exception e){System.out.println(e);}
		
		return 0;
    }
        
        public Customer verifyLogin(String username, String password)
    {
        try
        {	
            ConnectionFactory conFac = ConnectionFactory.getInstance();
            Connection connect = conFac.getConnection();
            PreparedStatement stmt;
            
            
                stmt = connect.prepareStatement("select cus_id, password from cus where cus_id = ?");
                stmt.setString(1, username);
            

            Customer wb2 = new Customer();

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                wb2.setID(rs.getString(1));
                wb2.setPassword(rs.getString(2));
                
            }
            rs.close();
            return wb2;

            
        } catch (SQLException e) {
           e.printStackTrace();
        }

        return null;

    }
        
        
        public Customer searchFromDB(String billId)
    {

        try
        {	
			Connection connect = conFac.getConnection();
			
			
				
				PreparedStatement stmt=connect.prepareStatement("select * from cus where cus_id = ?");
				stmt.setString(1,billId);
                                
                                Customer wb2 = new Customer();
                                Login log = new Login();
				
				ResultSet rs =stmt.executeQuery();
				while(rs.next())
				{
					wb2.setID(rs.getString(1));
					wb2.setName(rs.getString(2));
					wb2.setEmail(rs.getString(3));
					wb2.setPhn(rs.getString(4));
					wb2.setAddr(rs.getString(5));
                                        wb2.setPassword(rs.getString(6));
                                        
				}
				rs.close();
				return wb2;
			
        }catch(Exception e){System.out.println(e);}
		
		return null;

    }
        
        

public boolean saveToDB(Customer wb)
    {
        try
        {
            Connection connect = conFac.getConnection();
						
            PreparedStatement stmt=connect.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?)");
            stmt.setString(1,wb.getID());
            stmt.setString(2,wb.getName());
            stmt.setString(3,wb.getEmail());
            stmt.setString(4,wb.getPhn());
            stmt.setString(5,wb.getAddr());
            stmt.setString(6,wb.getPassword());
            stmt.setString(7,wb.getAnswer());
            stmt.setString(8,wb.getQuestion());
	
            return stmt.execute();
			
        }catch(Exception e){System.out.println(e);}
		
		
		return false;

    }

public boolean deleteFromDB(String id)
    {
        try
        {	
			Connection connect = conFac.getConnection();
                     
			
				PreparedStatement stmt=connect.prepareStatement("delete from customer where cus_id = ?");
				stmt.setString(1,id);
			
				return stmt.execute();
			
			
			
        }catch(Exception e){System.out.println(e);}
		
		return false;
    }
        
      
        


}
