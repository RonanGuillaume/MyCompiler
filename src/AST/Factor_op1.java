package AST;

import AST.Op1.Op1;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Factor_op1 extends Factor{
    private Op1 op1;
    private Factor factor;

    public Factor_op1(Op1 op1, Factor factor) {
        this.op1 = op1;
        this.factor = factor;
    }

    @Override
    public String toString() {
        return "" + op1 + factor;
    }
}
