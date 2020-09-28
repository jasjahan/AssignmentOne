package edu.csc413.calculator.evaluator;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.equalTo;

import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import edu.csc413.calculator.exceptions.InvalidExpressionException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;


import org.junit.jupiter.api.Test;

class EvaluatorTest {
	
	@Test
	void Evaluate_Expression_Test_One() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateExpression("4/2/2"), equalTo(1));
	}
	
	@Test
	void Evaluate_Simple_Expression_Test_One() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateSimpleExpression("2 + 2"), equalTo(4));
	}
	
	@Test
	void  Evaluate_Expression_Test_two() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateExpression("( 1 + 1 )"), equalTo(2));
	}
	
	@Test
	void Evaluate_Simple_Expression_Test_Two() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateSimpleExpression("2 + 3 * 4"), equalTo(14));
	}
	
	@Test
	void Evaluate_Expression_Test_Three() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateExpression("(2+3) * 4"), equalTo(20));
	}
	
	@Test
	void Evaluate_Simple_Expression_Test_Three() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateSimpleExpression("2 + 3 * 4"), equalTo(14));
	}
	
	@Test
	void Evaluate_Expression_Test_Four() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateExpression("(5*5) + (4 / 2)"), is(not(equalTo(30))));
		assertThat(testing.evaluateExpression("(5*5) + (4 / 2)"), equalTo(27));
	}
	
	@Test
	void Evaluate_Simple_Expression_Testing_Exception_One() throws InvalidExpressionException {
		
		Evaluator testing = new Evaluator();
		assertThat(testing.evaluateSimpleExpression(" 4/2 + 3 * 10"), equalTo(32));
		assertThat(testing.evaluateSimpleExpression(" 4/2 + 3 * 10"), is(not(equalTo(30))));
	}
	
	@Test
	void Evaluate_Expression_Exception_Test_Five() {
		Evaluator testing = new Evaluator();
		 Assertions.assertThrows(InvalidExpressionException.class, () -> {
		      testing.evaluateExpression("(3*4");
		    });
	}
    
	@Test
	void Evaluate_Expression_Exception_Test_Six() {
		Evaluator testing = new Evaluator();
		 Assertions.assertThrows(InvalidExpressionException.class, () -> {
		      testing.evaluateExpression("()");
		    });
	}
	
	@Test
	void Evaluate_Expression_Exception_Test_Seven() {
		Evaluator testing = new Evaluator();
		 Assertions.assertThrows(InvalidExpressionException.class, () -> {
		      testing.evaluateExpression("5+6)");
		    });
	}
	


}
