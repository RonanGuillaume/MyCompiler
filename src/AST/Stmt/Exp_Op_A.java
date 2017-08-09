package AST.Stmt;

import AST.*;

/**
 * Created by ronan
 * on 07/08/2017.
 */
public class Exp_Op_A extends AST{
    private Exp exp;

    public Exp_Op_A(Exp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return exp.toString();
    }
}
