package com.sonata.main;
import com.sonata.impl.EmpImpl;
import com.sonata.model.Employee;

public class EmpExec {
	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setEmpID(123);
	e1.setEmpName("sanjay");
	e1.setEmpSal(100);
	
	EmpImpl e2 = new EmpImpl ();
	e2.yearlySal(e1);
	e2.appSal(e1);

}
}