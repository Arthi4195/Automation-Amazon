
public class ExamDetailsFinal extends ExamDetails {
	//////override
	public void name() {
		super.name();
	}
	public void marks() {
		super.marks();
}
	
/////Default constructor
public ExamDetailsFinal() {
this (67);
System.out.println("Marks & Values");

}

///parameterized constructor
	
public ExamDetailsFinal(int Mark) {
this ("Karthick");
	System.out.println("Student mark is " +Mark);	
}	
	
public ExamDetailsFinal(String name) {
		System.out.println("Student name is " +name);
}


	public static void main(String[] args) {	
	ExamDetails ed = new ExamDetailsFinal();

	ed.name();
	ed.marks();
	
}
}