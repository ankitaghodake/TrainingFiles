import shape.Rectangle;
import shape.Circle;
import shape.Shapable;
import shape.Shape;
public class Test {

	public static double printArea(Shape s){
		return s.area();
	}
	public static void main(String[] args) {
//		Department dept =new Department(10,"HR");
//		Student s=new Student(1, "Ankita", 25,dept);
//		System.out.println("Department is "+s.getDepartment().getDepartmentName());
//		Circle c=new Circle(3);
//		System.out.println("Area of circle is "+c.area());
//		
//		Rectangle r=new Rectangle(2,3);
//		System.out.println("Area of rectangle is "+r.area());
//		
//		Employee e=new Employee(30000,"Ankita",10);
//		System.out.println(s);
//		System.out.println(r);
//		System.out.println(c);
//		System.out.println(e);
			
		Shape shape[]=new Shape[2];
		
		shape[0]=new Circle(4);
		shape[1]=new Rectangle(2,5);
		
		for(int i=0;i<shape.length;i++){
			System.out.println("Area is : "+shape[i].area());
		}
		
		Rectangle r=new Rectangle(2,4);
		Circle c=new Circle(3);
		//Shapable s=new Shapable();     cant create object of interfaces
		
		//System.out.println(Test.printArea(c));
		//System.out.println(Test.printArea(r));
		
		System.out.println((Shapable.a));
		System.out.println(r.name());
	}
}

