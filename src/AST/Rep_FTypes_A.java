package AST;

import AST.Type.Type;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class Rep_FTypes_A extends AST{
    private Type type;
    private Rep_FTypes_A rep_fTypes_a;

    public Rep_FTypes_A(Type type, Rep_FTypes_A rep_fTypes_a) {
        this.type = type;
        this.rep_fTypes_a = rep_fTypes_a;
    }

    @Override
    public String toString() {
        String result = type.toString();
        if (rep_fTypes_a != null){
            result+=rep_fTypes_a;
        }
        return result;
    }
}
