package AST.Stmt.Stmt_next;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Stmt_next_FunCall extends Stmt_next {
    private FunCall_Without_id funCall_without_id;

    public Stmt_next_FunCall(FunCall_Without_id funCall_without_id) {
        this.funCall_without_id = funCall_without_id;
    }

    @Override
    public String toString() {
        return funCall_without_id.toString() + ";\n";
    }
}
