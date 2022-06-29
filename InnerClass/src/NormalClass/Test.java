package NormalClass;

import NormalClass.A.B;

public class Test {
	public static void main(String args[]){
		A a=new A();
		a.display();
		B b=a.new B();
		b.display();
		
	}
}
