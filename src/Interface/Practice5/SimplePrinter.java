package Interface.Practice5;

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "this is a report about..";
        Printable prn = new Printer();
        prn.print(myDoc);

        Printable.printLine("안");

    }
}

interface Printable {
    static void printLine (String str) {
        System.out.println(str);
    }
    default void print (String str) {
        printLine(str);
    }
}

class Printer implements Printable {

}
