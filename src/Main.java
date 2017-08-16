public class Main {

    public static void main(String[] args) {
        Scanner ts = new Scanner("test/testData/simple/simple1.spl");
        Parser p = new Parser(ts);
        System.out.println(p.parse());
    }
}