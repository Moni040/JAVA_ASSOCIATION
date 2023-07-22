package com.gqt.test;

import com.gqt.entities.Account;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.setEmpId(143);
		e.setEmpName("Moni");
		Account a = new Account();
		a.setAccId(121);
		a.setAccName("Moni");
		e.setAcc(a);
		e.disp();
	}

}
