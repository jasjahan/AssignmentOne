package edu.csc413.calculator.operators;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasItem;
import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matcher;

class OperatorTest {

	@Test
	void Test_Create_AddOperator() {
		Operator operator = Operator.create("+");
		assertTrue(operator instanceof AddOperator);		
		}
	
	@Test
	void Test_Create_AddOperator_Negative() {
		Operator operator = Operator.create("+");
		assertFalse(operator instanceof SubtractOperator);		
		}
	
	@Test
	void Test_Create_SubtractOperator() {
		Operator operator = Operator.create("-");
		assertTrue(operator instanceof SubtractOperator);		
		}
	
	@Test
	void Test_Create_SubtractOperator_Negative() {
		Operator operator = Operator.create("-");
		assertFalse(operator instanceof AddOperator);		
		}
	
	@Test
	void Test_Create_MultiplyOperator() {
		Operator operator = Operator.create("*");
		assertTrue(operator instanceof MultiplyOperator);		
		}
	
	@Test
	void Test_Create_MultiplyOperator_Negative() {
		Operator operator = Operator.create("*");
		assertFalse(operator instanceof SubtractOperator);		
		}
	
	@Test
	void Test_Create_DivideOperator() {
		Operator operator = Operator.create("/");
		assertTrue(operator instanceof DivideOperator);		
		}
	@Test
	void Test_Create_DivideOperator_Negative() {
		Operator operator = Operator.create("/");
		assertFalse(operator instanceof MultiplyOperator);		
		}
	@Test
	void Test_Create_PowerOperator() {
		Operator operator = Operator.create("^");
		assertTrue(operator instanceof PowerOperator);		
		}
	@Test
	void Test_Create_PowerOperator_Negative() {
		Operator operator = Operator.create("^");
		assertFalse(operator instanceof AddOperator);		
		}
	
	@Test
	void Test_Create_check_Null() {
		Operator operator = Operator.create("");
		assertNull(operator);		
		}
	
}
