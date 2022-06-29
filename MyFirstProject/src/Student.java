


public class Student {
	private int studentID;
	private String studentName;
	private int studentAge;
	private Department department;


	public Student(int studentID, String studentName, int studentAge,Department department) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.department = department;
	}
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String toString(){
		return studentID+" "+studentName+" "+studentAge+" "+department;
	}
	
	
}
