package exercise14aug19;

public class Official {
	private String regNo;
	private String name;
	private String gender;
	private int age;
	private String dob;
	private String bloodGroup;
	private String mailId;
	private long mobNo;
	private long aadharNo;
	//private Address add;
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Official(String regNo, String name, String gender, int age, String dob, String bloodGroup, String mailId,
			long mobNo, long aadharNo) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.mailId = mailId;
		this.mobNo = mobNo;
		this.aadharNo = aadharNo;
	}
	public Official() {
		super();
		// TODO Auto-generated constructor stub
	}


}
