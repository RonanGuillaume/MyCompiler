package AST.Stmt;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Stmt_return extends Stmt {
    private Exp_Op_A exp_op_a;

    public Stmt_return(Exp_Op_A exp_op_a) {
        this.exp_op_a = exp_op_a;
    }

    @Override
    public String toString() {
        String result = "return";
        if (exp_op_a != null){
            result += " " + exp_op_a;
        }
        return result + ";\n";
    }
}
