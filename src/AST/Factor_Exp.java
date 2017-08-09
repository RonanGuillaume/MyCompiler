package AST;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Factor_Exp extends Factor {
    private Exp exp;

    public Factor_Exp(Exp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "(" + exp + ")";
    }
}
