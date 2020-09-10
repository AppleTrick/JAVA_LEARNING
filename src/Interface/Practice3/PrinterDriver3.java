package Interface.Practice3;

public class PrinterDriver3 {
    public static void main(String[] args) {
        String myDoc = "Tis is a report about ...";
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc);

        System.out.println();

        prn.printCMYK(myDoc);
    }
}

interface Printable {
    void print(String doc);
}

interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 blakc & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}
