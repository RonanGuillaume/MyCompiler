package AST.Stmt;

import AST.Exp;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Stmt_while extends Stmt {
    private Exp exp;
    private Rep_Stmt_A rep_stmt_a;

    public Stmt_while(Exp exp, Rep_Stmt_A rep_stmt_a) {
        this.exp = exp;
        this.rep_stmt_a = rep_stmt_a;
    }

    @Override
    public String toString() {
        String result = "while (" + exp + "){\n";
        if (rep_stmt_a != null){
            result += rep_stmt_a;
        }
        return result + "}\n";
    }
}
