package edu.csc413.calculator.operators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.csc413.calculator.evaluator.Operand;

class SubtractOperatorTest {

	@Test
	public void precedence_check_test_for_Subtract_Operator_with_equals() {
		SubtractOperator tester = new SubtractOperator();
		 assertEquals(1, tester.precedence());
	}
	
	@Test
	public void precedence_check_test_for_Subtract_Operator_with_assertThat() {
		SubtractOperator tester = new SubtractOperator();
		 assertThat(tester.precedence(),equalTo(1));
	}
	
	@Test
	public void precedence_check_negative_test_for_Addoperator() {
		SubtractOperator tester = new SubtractOperator();
		assertThat(tester.precedence(), is(not(equalTo(4))));
	}
	
	@Test
	public void execute_test_for_Subtract_Operator() {
		SubtractOperator tester = new SubtractOperator();
		Operand operand1= new Operand(5);
		Operand operand2= new Operand(5);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(equalTo(0)));
			
	}
	
	@Test
	public void execute_test_for_Subtract_Operator_negative() {
		SubtractOperator tester = new SubtractOperator();
		Operand operand1= new Operand(4);
		Operand operand2= new Operand(1);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(not(equalTo(2))));
			
	}

}
