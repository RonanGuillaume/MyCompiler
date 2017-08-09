package AST.Exp_Type;


/**
 * Created by ronan
 * on 07/08/2017.
 */
public class Exp_Type_int extends Exp_Type {
    private int integer;

    public Exp_Type_int(int integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "" + integer;
    }
}
