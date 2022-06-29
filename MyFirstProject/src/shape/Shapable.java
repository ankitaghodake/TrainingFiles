package shape;

//name always ends with able.
//interface can't implements interface
//interface can extends interface(any no of)
public interface Shapable extends Shapable2,Shapable3 {
	//methods are by default abstract and public
    double area();
    int test();
     // by default public static and final and can't be modify the value of variable
    int a=10;
}
