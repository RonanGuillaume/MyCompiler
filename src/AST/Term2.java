package AST;

import AST.Op2.Op2;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class Term2 extends AST{
    private Op2 op2;
    private Factor factor;
    private Term2 term2;

    public Term2(Op2 op2, Factor factor, Term2 term2) {
        this.op2 = op2;
        this.factor = factor;
        this.term2 = term2;
    }

    @Override
    public String toString() {
        String result = "" + op2 + "(" + factor;
        if (term2 != null){
            result += term2;
        }
        return result+")";
    }
}
