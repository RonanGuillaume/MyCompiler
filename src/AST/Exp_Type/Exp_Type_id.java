package AST.Exp_Type;

import AST.*;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Exp_Type_id extends Exp_Type {
    private String id;
    private Field_A field_a;

    public Exp_Type_id(String id, Field_A field_a) {
        this.id = id;
        this.field_a = field_a;
    }

    @Override
    public String toString() {
        String result = id;
        if (field_a != null){
            result += field_a;
        }
        return result;
    }
}
