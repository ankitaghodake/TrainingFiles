
public class Employee {
	private int empSalary;
	private String empName;
	private int empId;
	
	public Employee(int empSalary, String empName, int empId) {
		super();
		this.empSalary = empSalary;
		this.empName = empName;
		this.empId = empId;
	}
	

	@Override
	public String toString() {
		return "Employee [empSalary=" + empSalary + ", empName=" + empName
				+ ", empId=" + empId + "]";
	}
	
	
}
