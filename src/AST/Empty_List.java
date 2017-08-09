package AST;

import AST.Exp_Type.Exp_Type;

/**
 * Created by ronan
 * on 03/08/2017.
 */
public class Empty_List extends Exp_Type {
    public Empty_List() {
    }

    @Override
    public String toString() {
        return "[]";
    }
}
