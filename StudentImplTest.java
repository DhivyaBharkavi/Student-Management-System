package exercise14aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class StudentImplTest {

	public static void main(String[] args) {
		StudentImpl si=new StudentImpl();
		Official o = new Official();
		InsertDetails id=new InsertDetails();
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root","");
			System.out.println("========================================");
			System.out.println("====----> Welcome to Student Management Sysytem <----====");
			System.out.println("========================================");
			boolean b=true;
			while(b)
			{
			System.out.println("1.Press 1 Insert Student Details");
			System.out.println("2.Press 2 Display Student Details");
			System.out.println("3.Press 3 Display particular Student Record");
			System.out.println("4.Press 4 Update particular Student Records");
			System.out.println("5.Press 5 Delete particular Student Records");
			System.out.println("Select choice");
			int choice=scan.nextInt();
			if(choice==1)
			{
				ArrayList list=id.insertOfficialDetails();
				ArrayList al=id.insertPersonalDetails();
				//id.address();
				int rs=si.insertOfficialDetails(con,list);
				int r=si.insertPersonalDetails(con, al);
				if(rs!=-1)
				{
					System.out.println("Inserted Successfully");
				}
				else
				{
					System.out.println("Failed Successfully");
				}
			}
			}
		}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}			
}
