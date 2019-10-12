
public class Variables {
	
	 int a =10; //class variables
	
	
	public  void method1() {
int b =100;   //Local
System.out.println(b);
//local variable

	}

	public static void main(String[] args) {
		
		Variables v = new Variables();
		
		v.method1();
	System.out.println(v.a);
}
}

//////Static

