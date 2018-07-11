
public class Method {

	
public static void main (String[]Args) {
	
	System.out.println("this is add");
	System.out.println("this is sub");
//classname  objectname=new classname();
Method demo=new Method() ;
{
	System.out.println("demo");
}
	demo.mult();
	demo.div();
}
public void mult() {
System.out.println("this is mult");
}
public void div() {
System.out.println("this is div");
}
}