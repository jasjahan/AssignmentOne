package edu.csc413.calculator.operators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.csc413.calculator.evaluator.Operand;

class PowerOperatorTest {

	@Test
	public void Power_operator_precedence_check_test_with_equals() {
		PowerOperator tester = new PowerOperator();
		assertEquals(3, tester.precedence());
	}
	
	@Test
	public void Power_operator_precedence_check_test_with_assertThat() {
		PowerOperator tester = new PowerOperator();
		assertThat(tester.precedence(),equalTo(3));
	}
	
	
	@Test
	public void Power_operator_negative_precedence_check_test() {
		PowerOperator tester = new PowerOperator();
        assertThat(tester.precedence(),is(not(equalTo(5))));
    }
	
	
	@Test
	public void execute_test_for_Power_operator() {
		PowerOperator tester = new PowerOperator();
		Operand operand1= new Operand(2);
		Operand operand2= new Operand(2);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(equalTo(4)));
			
	}
	
	@Test
	public void execute_test_for_Power_operator_negative() {
		PowerOperator tester = new PowerOperator();
		Operand operand1= new Operand(10);
		Operand operand2= new Operand(1);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(not(equalTo(3))));
			
	}
	

}
