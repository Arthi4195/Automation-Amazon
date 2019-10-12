package assginment.com;

public class Minor1 implements MinorMarks {
	
	public void science() {
System.out.println(70);		
	}
	
	public void social() {
		System.out.println(80);
		
	}
	@Override
	public void tamilMarks() {
System.out.println(3);		
	}
	
	
	

	public static void main(String[] args) {
	Minor1 v  = new Minor1();
	v.science();
	v.social();
	v.tamilMarks();
	v.EnglishMarks();
	

	}

}
