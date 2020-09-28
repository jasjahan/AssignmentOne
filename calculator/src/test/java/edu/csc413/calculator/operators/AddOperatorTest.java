package edu.csc413.calculator.operators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;

import edu.csc413.calculator.evaluator.Operand;

class AddOperatorTest {

	@Test
	public void precedence_check_test_for_Addoperator_with_equals() {
		AddOperator tester = new AddOperator();
		 assertEquals(1, tester.precedence());
	}
	
	@Test
	public void precedence_check_test_for_AddOperator_with_assertThat() {
		AddOperator tester = new AddOperator();
		 assertThat(tester.precedence(),equalTo(1));
	}
	
	@Test
	public void precedence_check_negative_test_for_Addoperator() {
		AddOperator tester = new AddOperator();
		assertThat(tester.precedence(), is(not(equalTo(2))));
	}
	
	@Test
	public void execute_test_for_Addoperator() {
		AddOperator tester = new AddOperator();
		Operand operand1= new Operand(1);
		Operand operand2= new Operand(1);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(equalTo(2)));
			
	}
	
	@Test
	public void execute_test_for_Addoperator_negative() {
		AddOperator tester = new AddOperator();
		Operand operand1= new Operand(4);
		Operand operand2= new Operand(1);
		Operand result = tester.execute(operand1, operand2);
		int resultValue = result.getValue();
		assertThat(resultValue, is(not(equalTo(2))));
			
	}



}
