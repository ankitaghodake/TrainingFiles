package MethodLocalClass;

public class A {
	int a=10;
	public void display(){ /// A's method
	
		 class B{
			int b=20;
			public void display(){
				System.out.println(a);
			}
		}
		 B b=new B();  //B's object
		 b.display();  //B's method call
		 System.out.println(b.b);
	}
}
