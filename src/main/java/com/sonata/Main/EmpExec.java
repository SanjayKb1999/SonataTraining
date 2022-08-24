package com.sonata.Main;
import com.sonata.Model.Employee;
import com.sonata.Impl.EmpImpl;

public class EmpExec {
	public static void main(String args[]) {
	Employee e1 = new Employee();
	e1.setEmpID(123);
	e1.setEmpName("sanjay");
	e1.setEmpSal(100);
	
	EmpImpl e2 = new EmpImpl ();
	System.out.println(e2.yearlySal(e1));
	System.out.println(e2.appSal(e1));

}
}