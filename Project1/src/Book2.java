
public class Book2 implements Book1{
	

	public void maths() {
	System.out.println(50);
		
	}
	
	public void science() {
	System.out.println(60);
	
	}
		
	public static void main(String[] args) {
	Book2 B =new Book2();
	B.science();
	B.maths();

	}

}
