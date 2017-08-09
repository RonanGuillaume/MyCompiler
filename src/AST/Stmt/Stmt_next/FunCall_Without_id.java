package AST.Stmt.Stmt_next;

import AST.AST;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class FunCall_Without_id extends AST{
    private Rep_ActArgs_A rep_actArgs_a;

    public FunCall_Without_id(Rep_ActArgs_A rep_actArgs_a) {
        this.rep_actArgs_a = rep_actArgs_a;
    }

    @Override
    public String toString() {
        return "(" + rep_actArgs_a + ")";
    }
}
