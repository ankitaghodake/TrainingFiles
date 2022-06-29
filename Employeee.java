class Employeee{
  	private int id;
	private int age;
	private String name;

	public Employeee(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	}



	public void setId(int id){ this.id=id;}
	public int getId(){return id;}

	public static void main(String args[]){
		Employeee emp=new Employeee(1,25,"ankita");
		System.out.println(emp.getId());
	}


}