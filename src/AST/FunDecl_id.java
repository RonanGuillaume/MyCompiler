package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FunDecl_id extends FunDecl_ {
    private String id;
    private FunDecl2 funDecl2;

    public FunDecl_id(String id, FunDecl2 funDecl2) {
        this.id = id;
        this.funDecl2 = funDecl2;
    }

    @Override
    public String toString() {
        return id + " " + funDecl2;
    }
}
