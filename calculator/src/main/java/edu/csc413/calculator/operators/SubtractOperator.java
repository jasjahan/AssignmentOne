package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {

	@Override
	public int precedence() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Operand execute(Operand lhs, Operand rhs) {
		// TODO Auto-generated method stub
		int sub = lhs.getValue() - rhs.getValue();
		return new Operand(sub);
	}

}
