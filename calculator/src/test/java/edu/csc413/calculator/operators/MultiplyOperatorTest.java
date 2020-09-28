package edu.csc413.calculator.operators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.csc413.calculator.evaluator.Operand;

class MultiplyOperatorTest {

	@Test
	public void Multiply_operator_precedence_check_test_with_equals() {
		MultiplyOperator tester = new MultiplyOperator();
		assertEquals(2, tester.precedence());
	}
	
	@Test
	public void Multiply_operator_precedence_check_test_with_assertThat() {
		MultiplyOperator tester = new MultiplyOperator();
		assertThat(tester.precedence(),equalTo(2));
	}
	
	
	@Test
	public void Multiply_operator_negative_precedence_check_test() {
		MultiplyOperator tester = new MultiplyOperator();
        assertThat(tester.precedence(),is(not(equalTo(3))));
    }
	
	
	@Test
	public void execute_test_for_Multiplyoperator() {
		MultiplyOperator tester = new MultiplyOperator();
		Operand operand1= new Operand(6);
		Operand operand2= new Operand(3);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(equalTo(18)));
			
	}
	
	@Test
	public void execute_test_for_Multiply_operator_negative() {
		MultiplyOperator tester = new MultiplyOperator();
		Operand operand1= new Operand(10);
		Operand operand2= new Operand(1);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(not(equalTo(3))));
			
	}
	

}
