package AST.Stmt.Stmt_next;

import AST.AST;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Rep_ActArgs_A extends AST{
    private ActArgs actArgs;

    public Rep_ActArgs_A(ActArgs actArgs) {
        this.actArgs = actArgs;
    }

    @Override
    public String toString() {
        return actArgs.toString();
    }
}
