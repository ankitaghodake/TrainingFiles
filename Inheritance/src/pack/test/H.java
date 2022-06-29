package pack.test;

public class H {
	int num;
	String name;
	
	
	public H(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}


	public int hashCode(){
		return num;
	}
}
