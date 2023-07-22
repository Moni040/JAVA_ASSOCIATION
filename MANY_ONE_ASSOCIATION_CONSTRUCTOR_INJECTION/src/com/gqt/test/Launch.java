package com.gqt.test;

import com.gqt.entities.Branch;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Branch branch = new Branch(212, "Caliphone");
		
		
		Employee emp1= new Employee(1, "AMMI", branch);
		Employee emp2=new Employee(2, "PAMMI", branch);
		Employee emp3=new Employee(3, "MAMMI", branch);
		
		
		emp1.disp();
		emp2.disp();
		emp3.disp();
	}

}
