package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunType extends AST{
    private Rep_FTypes_A rep_fTypes_a;
    private RetType retType;

    public FunType(Rep_FTypes_A rep_fTypes_a, RetType retType) {
        this.rep_fTypes_a = rep_fTypes_a;
        this.retType = retType;
    }

    @Override
    public String toString() {
        String result = "";
        if (rep_fTypes_a != null){
            result += rep_fTypes_a;
        }
        return result + " -> " + retType;
    }
}
