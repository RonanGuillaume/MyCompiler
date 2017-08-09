package AST.Type_no_id;

import AST.Type.Type;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Type_No_id_Pair extends Type_No_id{
    private Type type1;
    private Type type2;

    public Type_No_id_Pair(Type type1, Type type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "(" + type1 + ", " + type2 + "]";
    }
}
