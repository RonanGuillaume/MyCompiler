package AST;

/**
 * Created by ronan
 * on 16/08/2017.
 */
public class Exp_next extends AST{
    private Exp exp;

    public Exp_next(Exp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return ", " + exp;
    }
}
