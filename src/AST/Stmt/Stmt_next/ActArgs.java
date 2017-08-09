package AST.Stmt.Stmt_next;

import AST.*;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class ActArgs extends AST{
    private Exp exp;
    private ActArgs_Op1_A actArgs_op1_a;

    public ActArgs(Exp exp, ActArgs_Op1_A actArgs_op1_a) {
        this.exp = exp;
        this.actArgs_op1_a = actArgs_op1_a;
    }

    @Override
    public String toString() {
        String result = exp.toString();
        if (actArgs_op1_a != null){
            result += " " + actArgs_op1_a;
        }

        return result;
    }
}
