package AST.Stmt;

import AST.AST;

/**
 * Created by ronan
 * on 07/08/2017.
 */
public class Rep_Stmt_A extends AST{
    private Stmt stmt;
    private Rep_Stmt_A rep_stmt_a;

    public Rep_Stmt_A(Stmt stmt, Rep_Stmt_A rep_stmt_a) {
        this.stmt = stmt;
        this.rep_stmt_a = rep_stmt_a;
    }

    @Override
    public String toString() {
        if (rep_stmt_a != null){
            return stmt.toString() + " " + rep_stmt_a;
        }
        return stmt.toString();
    }
}
