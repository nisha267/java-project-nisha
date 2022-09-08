package com.java.unit.junit_testing;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class Prime_Test {


	
		   @ParameterizedTest
		   @DisplayName("prime array test")
		   @ValueSource(ints= {7,3,6,11,2})
			void test_array(int a) {
			   for(int i=2;i<=a/2;++i)
				assertTrue(a%i==0);
			}
}
		   