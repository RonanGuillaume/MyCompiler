package AST;

import AST.Op1.Op1;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class Exp2 extends AST{
    private Op1 op1;
    private Term term;
    private Exp2 exp2;

    public Exp2(Op1 op1, Term term, Exp2 exp2) {
        this.op1 = op1;
        this.term = term;
        this.exp2 = exp2;
    }

    @Override
    public String toString() {
        String result = op1.toString() + "(" + term + " ";
        if (exp2 != null){
            result+=exp2;
        }
        return result + ")";
    }
}
