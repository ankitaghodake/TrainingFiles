package StaticClass;

public class A {
	static int a=10;
	public static class B{
		int b=20;
		public void display(){
			System.out.println(a); //only static members are accessed
			System.out.println(b);
		}
	}
	public void display(){
		System.out.println(a);
		B b=new B();
		System.out.println(b.b);
	}
}
