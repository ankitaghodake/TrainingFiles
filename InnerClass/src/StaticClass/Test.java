package StaticClass;
import StaticClass.A.B;

public class Test {
	public static void main(String args[]){
	A a=new A();
	A.B test=new B();
	test.display(); //B's method call
	System.out.println(A.a);  // static int a print
	a.display();   // A's method call
}
}
