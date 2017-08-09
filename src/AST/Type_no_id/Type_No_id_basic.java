package AST.Type_no_id;


import AST.Type.Type_Basic;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Type_No_id_basic extends Type_No_id {
    private Type_Basic type_basic;

    public Type_No_id_basic(Type_Basic type_basic) {
        this.type_basic = type_basic;
    }

    @Override
    public String toString() {
        return type_basic.toString();
    }
}
