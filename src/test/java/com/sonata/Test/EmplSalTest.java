package com.sonata.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sonata.impl.EmpImpl;
import com.sonata.model.Employee;
 class EmplSalTest{
@Test
 void addTest(){
	Employee es= new Employee();
	EmpImpl e= new EmpImpl();
	es.setEmpSal(100);
	assertEquals(1200,e.yearlySal(es));
}


}