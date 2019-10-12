package com.insurance.names;

public class StudentDetails {
	public void student(int id) {
		System.out.println("student id is "+id);
		

	}
public void student(String name, char initial) {
	System.out.println("st udent name and initial are "+name+","+initial);

}

public void student (char initial, String name) {
	System.out.println("srudent initial and name are "+initial+","+name);
}
                                             
	public static void main(String[] args) {
	StudentDetails st = new StudentDetails();
	st.student('K',"Karthiick");
	st.student("Arthi",'A');
	st.student(123);
	}
}
