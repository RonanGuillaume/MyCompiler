package AST.Type;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Type_pair extends Type {
    private Type type1;
    private Type type2;

    public Type_pair(Type type1, Type type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "(" + type1 + ", " + type2 + ")";
    }
}
