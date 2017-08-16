package AST;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Factor_Exp extends Factor {
    private Exp exp;
    private Exp_next exp_next;

    public Factor_Exp(Exp exp, Exp_next exp_next) {
        this.exp = exp;
        this.exp_next = exp_next;
    }

    @Override
    public String toString() {
        String result = "(" + exp;
        if (exp_next != null){
            result += exp_next;
        }
        return result + ")";
    }
}
