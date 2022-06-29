class Employee{
	private int id;
	private String name;
	private int salary;

	public static void main(String[] args){
		Employee employee=new Employee();
		employee.setId(200);
		employee.setName("Ankita");
		employee.setSalary(30000);
		employee.printData();
 	
	}

	public void setId(int empId){
		id=empId;
	}
	public int getId(){
		//return id;
	}
	public void setName(String empName){
		name=empName;
	}
       	public String getName(){
		return name;
	}
	public void setSalary(int empSalary){
		salary=empSalary;
	}
	public int getSalary(){
		return salary;
	}

	public void printData(){
		System.out.println(id+" " + name+" "  + salary);

	}

}