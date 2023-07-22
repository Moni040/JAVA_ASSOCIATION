package com.gqt.entities;

public class Department 
{
	private int deptId;
	private String deptname;
	
	Employee[]employees;

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
//	public void disp() 
//	{
//		System.out.println("The Department details are:");
//		System.out.println(deptId);
//		System.out.println(deptname);
//		System.out.println("The Employee details are:");
//		
//		for(Employee emp:employees) 
//		{
//			System.out.println(emp.getEmpId());
//			System.out.println(emp.getEmpName());
//			System.out.println();
//		}
//			
//	}
	
	


	public String toString() 
	{
		String s = "";
		
		s="Department details are:"+"\n"+
			deptId+"\n"+deptname+"\n"+
			"Employee Detailes are"+"\n";
		for(Employee emp:employees)
		{
			s+=emp.getEmpName()+"\n";
			s+=emp.getEmpId()+"\n"+"\n";
			
		// we can even use StringBuffer or StringBuilder class
		// and return _____.toString()
		}
		return s;	
		
	}
}
