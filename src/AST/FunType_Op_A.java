package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunType_Op_A extends AST{
    private FunType funType;

    public FunType_Op_A(FunType funType) {
        this.funType = funType;
    }

    @Override
    public String toString() {
        return " :: " + funType;
    }
}
