package com.java.unit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StuTest {

	
		Student st=new Student();
		StudentLogic sg=new StudentLogic();
		@Test
		void testper()
		{
			st.setM1(45);
			st.setM2(56);
			st.setM3(78);
			double p=sg.calculateper(st);
			assertEquals(59.66666666666667,p);
		}

}
