package exercise14aug19;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentImpl implements StudentInsertDetails {
	public int age;
	public  String regNoname,gender,dob,bloodGroup,mailId,address;
	public long mobNo,aadharNo;
	InsertDetails id=new InsertDetails();
	
	public int insertOfficialDetails(Connection con,ArrayList list) throws SQLException {
		int rs=0;
		for(int i=0;i<list.size();i++)
		{
		Official o=(Official) list.get(i);
		PreparedStatement ps=con.prepareStatement("INSERT INTO official_details VALUES (?,?,?,?,?,?,?,?,?)");
		ps.setString(1, o.getRegNo());
		ps.setString(2, o.getName());
		ps.setString(3, o.getGender());
		ps.setInt(4, o.getAge());
		ps.setString(5,o.getDob());
		ps.setString(6, o.getBloodGroup());
		ps.setString(7, o.getMailId());
		ps.setLong(8, o.getMobNo());
		ps.setLong(9, o.getAadharNo());
		rs=ps.executeUpdate();
		}
		return rs;
	}

	public int insertPersonalDetails(Connection con, ArrayList list) throws SQLException {
	int r=0;
	for(int i=0;i<list.size();i++)
	{
		//Address addr = (Address) list.get(i);
		Personal po = (Personal) list.get(i);
		Address add=po.getAddress();
		PreparedStatement pr=con.prepareStatement("INSERT INTO personal_details VALUES (?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?)");
		pr.setString(1, po.getName());
		pr.setString(2,add.getDoorNo());
		pr.setString(2, add.getStreetName());
		pr.setInt(2, add.getPinCode());
		pr.setString(2, add.getTaluk());
		pr.setString(2, add.getDistrict());
		pr.setString(2, add.getCity());
		pr.setString(2, add.getState());
		pr.setString(2,add.getCountry());
	//	pr.setString(2,po.getAddress().toString());
		pr.setString(3, po.getNationality());
		pr.setString(4, po.getCommunity());
		pr.setString(5, po.getFatherName());
		pr.setString(6, po.getFatherOccupation());
		pr.setInt(7, po.getFatherIncome());
		pr.setLong(8, po.getFatherMobNo());
		pr.setString(9, po.getGuardianName());
		pr.setLong(10, po.getGuardianMobNo());
		pr.setString(11, po.getMotherName());
		pr.setString(12, po.getMotherOccupation());
		pr.setInt(13,po.getMotherIncome());
		pr.setLong(14, po.getMotherMobNo());
		pr.setString(15, po.getSpecialCategory());
		pr.setLong(16, po.getPanNo());
		pr.setString(17, po.getIdentityMarks());
		pr.setLong(18, po.getMobNo());
		r=pr.executeUpdate();
		//list.add(po);
	}
		return r;
	}
	public int address(Connection con, ArrayList list) throws SQLException 
	{
		
		int rr=0;
		for(int i=0;i<list.size();i++)
		{
			Address a = (Address) list.get(i);
			PreparedStatement pr=con.prepareStatement("INSERT INTO address_details VALUES (?,?,?,?,?,?,?,?)");
			pr.setString(1, a.getDoorNo());
			pr.setString(2, a.getStreetName());
			pr.setInt(3, a.getPinCode());
			pr.setString(4, a.getTaluk());
			pr.setString(5, a.getDistrict());
			pr.setString(6, a.getCity());
			pr.setString(7, a.getState());
			pr.setString(8,a.getCountry());
			rr=pr.executeUpdate();
		}
		return rr;  
		
	}

}
