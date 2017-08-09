package AST.Stmt;

import AST.AST;

/**
 * Created by ronan
 * on 07/08/2017.
 */
public class Else_Stmt_A extends AST{
    private Rep_Stmt_A rep_stmt_a;

    public Else_Stmt_A(Rep_Stmt_A rep_stmt_a) {
        this.rep_stmt_a = rep_stmt_a;
    }

    @Override
    public String toString() {
        return "else {" + rep_stmt_a + "}";
    }
}
