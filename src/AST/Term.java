package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class Term extends AST{
    private Factor factor;
    private Term2 term2;

    public Term(Factor factor, Term2 term2) {
        this.factor = factor;
        this.term2 = term2;
    }

    @Override
    public String toString() {
        String result = factor.toString();
        if (term2 != null){
            result+=term2;
        }
        return result;
    }
}
