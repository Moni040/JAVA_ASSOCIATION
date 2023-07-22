package com.gqt.test;

import com.gqt.entities.Department;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Department dept = new Department();
		dept.setDeptId(143);
		dept.setDeptname("JAVA");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("MONI");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("JASH");
		
		Employee emp3 = new Employee();
		emp3.setEmpId(3);
		emp3.setEmpName("AMAR");
		Employee[] e= new Employee[3];
		e[0]=emp1;
		e[1]=emp2;
		e[2]=emp3;
		
		dept.setEmployees(e);
		
		System.out.println(dept);
	}

}
