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
@Test
public void addTest2(){
	Employee es= new Employee();
	EmpImpl e= new EmpImpl();
	es.setEmpSal(2000);
	Assertions.assertEquals(24000,e.yearlySal(es));
}
@Test
public void addTest3(){
	Employee es= new Employee();
	EmpImpl e= new EmpImpl();
	es.setEmpSal(1000);
	Assertions.assertEquals(12000,e.yearlySal(es));
}
@Test
public void addTest4(){
	Employee es= new Employee();
	EmpImpl e= new EmpImpl();
	es.setEmpSal(2000);
	Assertions.assertEquals(12000,e.yearlySal(es));
}


}