class Student1{
	//class variables
	private int id;
	private String name;
	private int age;
	private Department department;
	private MyDate myDate;

	// parameterized constructor
	public Student1(int id,String name,int age,Department department,MyDate myDate){
		this.id=id;
		this.name=name;
		this.age=age;
		this.department=department;
		this.myDate=myDate;
	}
	
	//mutator and accessor method
	
	public void setMyDate(MyDate myDate){
	this.myDate=myDate;
	}
	public MyDate getMyDate(){
		return myDate;
	}

      	public void setId(int id){
		this.id=id;
	}
 	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
	this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	//setter getter method for department class
	public void setDepartment(Department department){
	this.department=department;
	}
	public Department getDepartment(){
		return department;
	}



}