package AST.Stmt.Stmt_next;

import AST.AST;

/**
 * Created by ronan
 * on 07/08/2017.
 */
public class ActArgs_Op1_A extends AST{
    private ActArgs actArgs;

    public ActArgs_Op1_A(ActArgs actArgs) {
        this.actArgs = actArgs;
    }

    @Override
    public String toString() {
        return ", " + actArgs;
    }
}
