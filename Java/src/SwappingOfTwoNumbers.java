
public class SwappingOfTwoNumbers {
public static void main (String[]args) {
	int x=10 ;
	int y=20;
	System.out.println("Before swap");
	System.out.println("x value:"+x);
	System.out.println("y value:"+y);
	x=x+y;//30
	y=x-y;//10
	x=x-y;//20
	System.out.println("After swap");
	System.out.println("x value:"+x);
	System.out.println("y value:"+y);
	
}
}
