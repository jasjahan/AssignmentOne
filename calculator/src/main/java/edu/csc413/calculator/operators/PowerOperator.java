package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{

	@Override
	public int precedence() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Operand execute(Operand lhs, Operand rhs) {
		int value1 = lhs.getValue();
		int value2 = rhs.getValue();
		int value = (int) Math.pow(value1, value2);
		return new Operand(value);
		
	}

}
