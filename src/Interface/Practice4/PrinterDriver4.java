package Interface.Practice4;

public class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc = "this is a report about";
        Printable prn = new Prn731Drv();
        prn.print(myDoc);

        Printable prn2 = new Prn909Drv();
        prn2.print(myDoc);
        prn2.printCMYK(myDoc);
    }
}

interface Printable {
    void print(String doc);
    default void printCMYK(String doc) {}
}

class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class Prn909Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 printer black & white ver");
        System.out.println();
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println();
    }
}
