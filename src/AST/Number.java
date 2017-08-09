package AST;

import AST.Exp_Type.Exp_Type;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Number extends Exp_Type {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
