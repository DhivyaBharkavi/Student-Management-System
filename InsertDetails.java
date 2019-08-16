package exercise14aug19;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertDetails {
	Scanner scan = new Scanner(System.in);
	public String regNo,age;
	public  String name,gender,dob,bloodGroup,mailId,address;
	public long mobNo,aadharNo;
	
	
	public ArrayList insertOfficialDetails()
	{
		//scan.nextLine();
		
		System.out.println("Enter a student register number");
		String rNo=scan.nextLine();
		System.out.println("Enter a student name ");
		String sname=scan.nextLine();
		System.out.println("Enter gender");
		String gender=scan.nextLine();
		//scan.nextInt();
		System.out.println("Enter age");
		int age=scan.nextInt();
		System.out.println("Enter date of birth");
		String dob=scan.nextLine();
		scan.next();
		System.out.println("Enter blood group");
		String blood_group=scan.nextLine();
		scan.next();
		System.out.println("Enter mail id");
		String mailId=scan.nextLine();
		scan.next();
		System.out.println("Enter mobile number");
		long mobNo=scan.nextLong();
		System.out.println("Enter aadhar number");
		long aadharNo=scan.nextLong();
		Official o = new Official(rNo,sname,gender,age,dob,blood_group,mailId,mobNo,aadharNo);
		ArrayList list = new ArrayList();
		list.add(o);
		return list;
	
	}
	public void address()
	{
		
		System.out.println("Enter door number");
		String doorNo=scan.next();
		System.out.println("Enter street name");
		String streetName=scan.next();
		System.out.println("Enter pincode");
		int pinCode=scan.nextInt();
		System.out.println("Enter a taluk");
		String taluk=scan.next();
		System.out.println("Enter a district");
		String district=scan.next();
		System.out.println("Enter city");
		String city=scan.next();
		System.out.println("Enter state");
		String state=scan.next();
		System.out.println("Enter country");
		String country=scan.next();
		
		
	}
	public ArrayList insertPersonalDetails( )
	{
		String doorNo; String streetName;int pinCode;String taluk;
		String district;String city;String state;String country;
		ArrayList list=new ArrayList();
		System.out.println("Enter a name");
		String name=scan.next();
		address();
		Address addr = new Address();
		/*addr.setDoorNo(doorNo);
		addr.setStreetName(streetName);
		addr.setPinCode(pinCode);
		addr.setTaluk(taluk);
		addr.setDistrict(district);
		addr.setCity(city);
		addr.setState(state);
		addr.setCountry(country);*/
		System.out.println("Enter a nationality");
		String nationality=scan.next();
		System.out.println("Enter a community");
		String community=scan.next();
		System.out.println("Enter a father name");
		String fatherName=scan.next();
		System.out.println("Enter a father occupation");
		String fatherOccup=scan.next();
		System.out.println("Enter a father income");
		int fatherInc=scan.nextInt();
		System.out.println("Enter a father mobile number");
		long fatherMobNo=scan.nextLong();
		System.out.println("Enter a guardian name");
		String guardianName=scan.next();
		System.out.println("Enter a guardian mobile number");
		long guardMobNo=scan.nextLong();
		System.out.println("Enter a mother name");
		String motherName=scan.next();
		System.out.println("Enter a mother occupation");
		String motherOccup=scan.next();
		System.out.println("Enter a mother income");
		int motherInc=scan.nextInt();
		System.out.println("Enter a mother mobile number");
		long motherMobNo=scan.nextLong();
		System.out.println("Enter a special category");
		String specialCate=scan.next();
		System.out.println("Enter a pancard number");
		long panNo=scan.nextLong();
		System.out.println("Enter identity marks");
		String idenMarks=scan.next();
		System.out.println("Enter mobile number");
		long mobNo=scan.nextLong();
		
		Personal p = new Personal(name,addr,nationality,community,fatherName,fatherOccup,fatherInc,fatherMobNo,
				guardianName,guardMobNo,motherName,motherOccup,motherInc,motherMobNo,specialCate,panNo,idenMarks,mobNo);
		list.add(p);
		return list;
		
		
	}
	
}
