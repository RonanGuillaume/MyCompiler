package AST;

import AST.Field.Field_Op;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Field_A extends AST{
    private Field_Op field_op;
    private Field_A field_a;

    public Field_A(Field_Op field_op, Field_A field_a) {
        this.field_op = field_op;
        this.field_a = field_a;
    }

    @Override
    public String toString() {
        String result = "."+field_op;
        if (field_a != null){
            result += field_a;
        }
        return result;
    }
}

