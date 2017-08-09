package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class Exp extends AST{
    private Term term;
    private Exp2 exp2;

    public Exp(Term term, Exp2 exp2) {
        this.term = term;
        this.exp2 = exp2;
    }

    @Override
    public String toString() {
        String result = term.toString();
        if (exp2 != null){
            result+=exp2;
        }
        return result;
    }
}
