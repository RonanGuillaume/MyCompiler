package AST;


/**
 * Created by ronan
 * on 02/08/2017.
 */
public class VarDecl_Decl extends Decl {
    private String id;
    private Exp exp;

    public VarDecl_Decl(String id, Exp exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "var " + id + " = " + exp;
    }
}
