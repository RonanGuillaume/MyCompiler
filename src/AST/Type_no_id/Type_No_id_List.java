package AST.Type_no_id;

import AST.Type.Type;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Type_No_id_List extends Type_No_id {
    private Type type;

    public Type_No_id_List(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + type + "]";
    }
}
