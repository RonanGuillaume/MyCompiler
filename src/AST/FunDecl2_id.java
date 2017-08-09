package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunDecl2_id extends FunDecl2 {
    private String id;
    private Exp exp;

    public FunDecl2_id(String id, Exp exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return id + " = " + exp;
    }
}
