package AST;

import AST.Type.Type;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunDecl_type extends FunDecl_ {
    private Type type;
    private String id;
    private Exp exp;

    public FunDecl_type(Type type, String id, Exp exp) {
        this.type = type;
        this.id = id;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "" + type + " " + id + " = " + exp + ";\n";
    }
}
