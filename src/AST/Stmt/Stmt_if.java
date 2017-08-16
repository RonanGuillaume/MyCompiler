package AST.Stmt;

import AST.Exp;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Stmt_if extends Stmt {
    private Exp exp;
    private Rep_Stmt_A rep_stmt_a;
    private Else_Stmt_A else_stmt_a;

    public Stmt_if(Exp exp, Rep_Stmt_A rep_stmt_a, Else_Stmt_A else_stmt_a) {
        this.exp = exp;
        this.rep_stmt_a = rep_stmt_a;
        this.else_stmt_a = else_stmt_a;
    }

    @Override
    public String toString() {
        String result = "if (" + exp + "){\n";
        if (rep_stmt_a != null){
            result += rep_stmt_a;
        }
        result += "}\n";
        if (else_stmt_a != null){
            result += else_stmt_a;
        }
        return result;
    }
}
