package NormalClass;

public class A {
	int a=10;
	public class B{
		int c=20;
		public void display(){
			System.out.println(a);
			System.out.println(c);
		}
	}
	
	public void display(){
		B b=new B();
		System.out.println(a);
	    System.out.println(b.c);
	}
}
