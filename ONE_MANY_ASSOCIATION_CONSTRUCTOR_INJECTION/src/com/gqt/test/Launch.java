package com.gqt.test;

import com.gqt.entities.Department;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee(1, "AMAR");
		Employee emp2=new Employee(2, "JASH");
		Employee emp3=new Employee(3, "MONI");
		Employee [] e= new Employee[3];
		e[0]=emp1;
		e[1]=emp2;
		e[2]=emp3;
		
		Department dept=new Department(100, "JAVA", e);
		
		//dept.disp();
		System.out.println(dept);
		
	}

}
