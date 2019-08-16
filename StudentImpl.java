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
		Address a = (Address) list.get(i);
		Personal po = (Personal) list.get(i);
		PreparedStatement pr=con.prepareStatement("INSERT INTO personal_details VALUES (?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?)");
		pr.setString(1, po.getName());
		pr.setString(2,po.getAddress());
		pr.setString(3, po.getNationality());
		pr.setString(6, po.getCommunity());
		pr.setString(7, po.getFatherName());
		pr.setString(8, po.getFatherOccupation());
		pr.setInt(9, po.getFatherIncome());
		pr.setLong(10, po.getFatherMobNo());
		pr.setString(11, po.getGuardianName());
		pr.setLong(12, po.getGuardianMobNo());
		pr.setString(13, po.getMotherName());
		pr.setString(14, po.getMotherOccupation());
		pr.setInt(15,po.getMotherIncome());
		pr.setLong(16, po.getMotherMobNo());
		pr.setString(17, po.getSpecialCategory());
		pr.setLong(18, po.getPanNo());
		pr.setString(19, po.getIdentityMarks());
		pr.setLong(20, po.getMobNo());
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
