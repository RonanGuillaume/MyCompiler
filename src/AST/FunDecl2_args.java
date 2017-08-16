package AST;

import AST.Stmt.Rep_Stmt_A;
import AST.Stmt.Stmt;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunDecl2_args extends FunDecl2 {
    private FArgs_Op_A fArgs_op_a;
    private FunType_Op_A funType_op_a;
    private Rep_VarDecl_A rep_varDecl_a;
    private Stmt stmt;
    private Rep_Stmt_A rep_stmt_a;

    public FunDecl2_args(FArgs_Op_A fArgs_op_a, FunType_Op_A funType_op_a, Rep_VarDecl_A rep_varDecl_a, Stmt stmt, Rep_Stmt_A rep_stmt_a) {
        this.fArgs_op_a = fArgs_op_a;
        this.funType_op_a = funType_op_a;
        this.rep_varDecl_a = rep_varDecl_a;
        this.stmt = stmt;
        this.rep_stmt_a = rep_stmt_a;
    }

    @Override
    public String toString() {
        String result = "(";
        if (fArgs_op_a != null){
            result += fArgs_op_a;
        }
        result +=")";
        if (funType_op_a != null){
            result += funType_op_a;
        }
        result += "{\n";
        if (rep_varDecl_a != null){
            result += rep_varDecl_a + "";
        }
        result += stmt;
        if (rep_stmt_a != null){
            result += rep_stmt_a;
        }
        return result + "}\n";
    }
}
