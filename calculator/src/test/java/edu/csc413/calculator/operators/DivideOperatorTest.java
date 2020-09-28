package edu.csc413.calculator.operators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.csc413.calculator.evaluator.Operand;

class DivideOperatorTest {

	@Test
	public void Divide_operator_precedence_check_test_with_equals() {
		DivideOperator tester = new DivideOperator();
		assertEquals(2, tester.precedence());
	}
	
	@Test
	public void Divide_operator_precedence_check_test_with_assertThat() {
		DivideOperator tester = new DivideOperator();
		assertThat(tester.precedence(),equalTo(2));
	}
	
	
	@Test
	public void Divide_operator_negative_precedence_check_test() {
		DivideOperator tester = new DivideOperator();
        assertThat(tester.precedence(),is(not(equalTo(10))));
    }
	
	
	@Test
	public void execute_test_for_Divideoperator() {
		DivideOperator tester = new DivideOperator();
		Operand operand1= new Operand(6);
		Operand operand2= new Operand(3);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(equalTo(2)));
			
	}
	
	@Test
	public void execute_test_for_Divideoperator_negative() {
		DivideOperator tester = new DivideOperator();
		Operand operand1= new Operand(4);
		Operand operand2= new Operand(1);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(not(equalTo(2))));
			
	}
	
}
