package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends Operator{

	@Override
	public int precedence() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public Operand execute(Operand lhs, Operand rhs)  {
		// TODO Auto-generated method stub
		int div = lhs.getValue() / rhs.getValue();
		
		return new Operand(div);
	}

}
