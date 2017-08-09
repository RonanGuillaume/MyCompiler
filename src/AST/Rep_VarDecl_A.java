package AST;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Rep_VarDecl_A extends AST{
    private VarDecl varDecl;
    private Rep_VarDecl_A rep_varDecl_a;

    public Rep_VarDecl_A(VarDecl varDecl, Rep_VarDecl_A rep_varDecl_a) {
        this.varDecl = varDecl;
        this.rep_varDecl_a = rep_varDecl_a;
    }

    @Override
    public String toString() {
        String result = varDecl.toString() + " ;";
        if (rep_varDecl_a != null){
            result += " " + rep_varDecl_a;
        }
        return result;
    }
}
