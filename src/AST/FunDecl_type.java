package AST;

import AST.Type_no_id.Type_No_id;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunDecl_type extends FunDecl_ {
    private Type_No_id type_no_id;
    private String id;
    private Exp exp;

    public FunDecl_type(Type_No_id type_no_id, String id, Exp exp) {
        this.type_no_id = type_no_id;
        this.id = id;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "" + type_no_id + " " + id + " = " + exp + ";\n";
    }
}
