package com.gqt.test;

import com.gqt.entities.Account;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Account a = new Account(12345, "Moni");
		
		Employee e = new Employee(40, "Moni", a);
		
		e.disp();
		
	}

}
