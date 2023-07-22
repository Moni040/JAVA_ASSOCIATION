package com.gqt.entities;

public class Employee 
{
	private int empId;
	private String empName;
	
	private Branch branch;

	public Employee(int empId, String empName, Branch branch) 
	{
	
		this.empId = empId;
		this.empName = empName;
		this.branch = branch;
	}
	public void disp() 
	{
		System.out.println("The employee detailes are:");
		System.out.println();
		System.out.println(empId);
		System.out.println(empName);
		System.out.println();
		System.out.println("The Branch detailes are:");
		System.out.println();
		System.out.println(branch.getBrID());
		System.out.println(branch.getBrName());
		System.out.println();
	}
	
	
}
