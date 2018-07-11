package multilevel;

public class Parent extends Grandparent {
	public void tc_2() {
		System.out.println("this is parent");
	}
		public static void main(String[] args) {
		Parent c=new Parent();
			c.tc_1();
			c.tc_2();

		}
}
