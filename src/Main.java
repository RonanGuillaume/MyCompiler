public class Main {

    public static void main(String[] args) {
        Scanner ts = new Scanner("example1.zo");
        Parser p = new Parser(ts);
        p.parse();
    }
}