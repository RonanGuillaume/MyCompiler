package AST.Stmt.Stmt_next;

import AST.Exp;
import AST.Field_A;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Stmt_next_Field_A extends Stmt_next {
    private Field_A field_a;
    private Exp exp;

    public Stmt_next_Field_A(Field_A field_a, Exp exp) {
        this.field_a = field_a;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return field_a.toString() + " = " + exp + ";";
    }
}
