package AST;

/**
 * Created by ronan
 * on 02/08/2017.
 */
public class FArgs extends AST{
    private String id;
    private FArgs_Op1_A fArgs_op1_a;

    public FArgs(String id, FArgs_Op1_A fArgs_op1_a) {
        this.id = id;
        this.fArgs_op1_a = fArgs_op1_a;
    }

    @Override
    public String toString() {
        String result = id;
        if (fArgs_op1_a != null){
            result += fArgs_op1_a;
        }
        return result;
    }
}
