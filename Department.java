class Department{
	//class variable
	private int id;
	private String name;

	//parameterized constructor
	public Department(int id,String name){
		this.id=id;
		this.name=name;
	}
	//mutator and accessor methods
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

}