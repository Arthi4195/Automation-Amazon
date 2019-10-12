
public class Students {
	public Students() {
		System.out.println("AM default constructor");
	}
	
	public Students(String name) {
	
		System.out.println("Student name is " +name);
		

	}
	
	public Students( int id) {
		System.out.println("Student id is " +id);
		System.out.println("Parameterized constructor");
	}
	public static void main(String[] args) {
		
Students st = new Students();
Students st1 = new Students("Arthi");
Students st2 = new Students (1000);

	}

}
