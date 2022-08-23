package com.sonata.Test;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.Impl.EmpImpl;
import com.sonata.Model.Employee;
public class EmplSalTest{
@Test
public void addTest(){
	Employee es= new Employee();
	EmpImpl e= new EmpImpl();
	es.setEmpSal(100);
	Assertions.assertEquals(1200,e.yearlySal(es));
}


}