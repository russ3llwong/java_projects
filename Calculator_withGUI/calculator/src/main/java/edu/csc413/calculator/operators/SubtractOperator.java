package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {
    @Override
    public int priority() {
        return 1;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        int opr1 = op1.getValue();
        int opr2 = op2.getValue();
        int opr3 = opr1 - opr2;
        Operand op3 = new Operand(opr3);
        return op3;
    }
}