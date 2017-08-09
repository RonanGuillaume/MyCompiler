package AST.Stmt;

import AST.Stmt.Stmt_next.Stmt_next;

/**
 * Created by ronan
 * on 06/08/2017.
 */
public class Stmt_id extends Stmt {
    private String id;
    private Stmt_next stmt_next;

    public Stmt_id(String id, Stmt_next stmt_next) {
        this.id = id;
        this.stmt_next = stmt_next;
    }

    @Override
    public String toString() {
        return id + " " + stmt_next;
    }
}
