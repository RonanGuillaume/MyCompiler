package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FArgs_Op1_A extends AST{
    private FArgs fArgs;

    public FArgs_Op1_A(FArgs fArgs) {
        this.fArgs = fArgs;
    }

    @Override
    public String toString() {
        return ", " + fArgs;
    }
}
