package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class Rep_Decl_A extends AST{
    private Decl decl;
    private Rep_Decl_A rep_decl_a;

    public Rep_Decl_A(Decl decl, Rep_Decl_A rep_decl_a) {
        this.decl = decl;
        this.rep_decl_a = rep_decl_a;
    }

    @Override
    public String toString() {
        String result = decl.toString();
        if (rep_decl_a != null){
            result+=rep_decl_a;
        }
        return result;
    }
}
