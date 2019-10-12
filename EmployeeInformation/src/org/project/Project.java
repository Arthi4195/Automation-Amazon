package org.project;
import org.employee.Employee;
import org.company.Company;
import org.client.Client;


public class Project {
	public void projectName(){
		System.out.println("Deutche Bank");
		System.out.println("Grubhub");
	}

	public static void main(String[] args) {
		Employee a = new Employee();
		Company b = new Company();
		Client c = new Client();
		Project d = new Project();
		a.employeeName();
		b.companyName();
		c.clientName();
		d.projectName();
	
		
		
	

	}

}
